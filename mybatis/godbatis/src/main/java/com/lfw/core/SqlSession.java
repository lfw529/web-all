package com.lfw.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据库会话对象
 */
public class SqlSession {
    private TransactionManager transactionManager;
    private Map<String, GodMappedStatement> mappedStatements;

    public SqlSession(TransactionManager transactionManager, Map<String, GodMappedStatement> mappedStatements) {
        this.transactionManager = transactionManager;
        this.mappedStatements = mappedStatements;
    }

    /**
     * 插入数据
     *
     * @param sqlId 要执行的sqlId
     * @param obj   插入的数据
     * @return
     */
    public int insert(String sqlId, Object obj) {
        GodMappedStatement godMappedStatement = mappedStatements.get(sqlId);
        Connection connection = transactionManager.getConnection();

        // 获取sql语句
        // insert into t_car(id,car_num,brand,guide_price,produce_time,car_type) values(null,#{carNum},#{brand},#{guidePrice},#{produceTime},#{carType})
        String godbatisSql = godMappedStatement.getSql();

        // insert into t_car(id,car_num,brand,guide_price,produce_time,car_type) values(null,?,?,?,?,?)
        String sql = godbatisSql.replaceAll("#\\{[a-zA-Z0-9_\\$]*}", "?");

        // 重点一步
        Map<Integer, String> map = new HashMap<>();
        int index = 1;
        while (godbatisSql.contains("#")) {
            int beginIndex = godbatisSql.indexOf("#") + 2;
            int endIndex = godbatisSql.indexOf("}");
            map.put(index++, godbatisSql.substring(beginIndex, endIndex).trim());
            godbatisSql = godbatisSql.substring(endIndex + 1);
        }

        final PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);

            // 给?赋值
            map.forEach((k, v) -> {
                try {
                    // 获取java实体类的get方法名
                    String getMethodName = "get" + v.toUpperCase().charAt(0) + v.substring(1);
                    Method getMethod = obj.getClass().getDeclaredMethod(getMethodName);
                    ps.setString(k, getMethod.invoke(obj).toString());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            int count = ps.executeUpdate();
            ps.close();
            return count;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 查询一个对象
     *
     * @param sqlId
     * @param parameterObj
     * @return
     */
    public Object selectOne(String sqlId, Object parameterObj) {
        GodMappedStatement godMappedStatement = mappedStatements.get(sqlId);
        Connection connection = transactionManager.getConnection();
        // 获取sql语句
        String godbatisSql = godMappedStatement.getSql();
        String sql = godbatisSql.replaceAll("#\\{[a-zA-Z0-9_\\$]*}", "?");
        // 执行sql
        PreparedStatement ps = null;
        ResultSet rs = null;
        Object obj = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, parameterObj.toString());
            rs = ps.executeQuery();
            if (rs.next()) {
                // 将结果集封装对象，通过反射
                String resultType = godMappedStatement.getResultType();
                Class<?> aClass = Class.forName(resultType);
                Constructor<?> con = aClass.getDeclaredConstructor();
                obj = con.newInstance();
                // 给对象obj属性赋值
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = rsmd.getColumnName(i);
                    String setMethodName = "set" + columnName.toUpperCase().charAt(0) + columnName.substring(1);
                    Method setMethod = aClass.getDeclaredMethod(setMethodName, aClass.getDeclaredField(columnName).getType());
                    setMethod.invoke(obj, rs.getString(columnName));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return obj;
    }

    public void commit() {
        try {
            transactionManager.getConnection().commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void rollback() {
        try {
            transactionManager.getConnection().rollback();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            transactionManager.getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
