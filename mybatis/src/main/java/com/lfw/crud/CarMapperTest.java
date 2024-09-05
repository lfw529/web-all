package com.lfw.crud;

import com.lfw.pojo.Car;
import com.lfw.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarMapperTest {
    @Test
    public void testInsertCar1() {
        // 准备数据
        Map<String, Object> map = new HashMap<>();
        map.put("k1", "103");
        map.put("k2", "奔驰E300L");
        map.put("k3", 50.3);
        map.put("k4", "2020-10-01");
        map.put("k5", "燃油车");
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句（使用map集合给sql语句传递数据）
        int count = sqlSession.insert("insertCar1", map);
        System.out.println("插入了几条记录：" + count);
    }

    @Test
    public void testInsertCar2() {
        // 准备数据
        Map<String, Object> map = new HashMap<>();
        map.put("k1", "103");
        map.put("k2", "奔驰E300L");
        map.put("k3", 50.3);
        map.put("k4", "2020-10-01");
        map.put("k5", "燃油车");
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句（使用map集合给sql语句传递数据）
        int count = sqlSession.insert("insertCar2", map);
        System.out.println("插入了几条记录：" + count);
    }

    @Test
    public void testInsertCar3() {
        // 准备数据
        Map<String, Object> map = new HashMap<>();
        // 让key的可读性增强
        map.put("carNum", "103");
        map.put("brand", "奔驰E300L");
        map.put("guidePrice", 50.3);
        map.put("produceTime", "2020-10-01");
        map.put("carType", "燃油车");
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句（使用map集合给sql语句传递数据）
        int count = sqlSession.insert("insertCar3", map);
        System.out.println("插入了几条记录：" + count);
    }

    @Test
    public void testInsertCarByPOJO() {
        // 创建POJO，封装数据
        Car car = new Car();
        car.setCarNum("103");
        car.setBrand("奔驰C200");
        car.setGuidePrice(33.23);
        car.setProduceTime("2020-10-11");
        car.setCarType("燃油车");
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL，传数据
        int count = sqlSession.insert("insertCarByPOJO", car);
        System.out.println("插入了几条记录" + count);
    }

    @Test
    public void testInsertCarByPOJO1() {
        // 创建POJO，封装数据
        Car car = new Car();
        car.setCarNum("103");
        car.setBrand("奔驰C200");
        car.setGuidePrice(33.23);
        car.setProduceTime("2020-10-11");
        car.setCarType("燃油车");
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL，传数据
        int count = sqlSession.insert("insertCarByPOJO1", car);
        System.out.println("插入了几条记录" + count);
    }

    @Test
    public void testDeleteByCarNum() {
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句
        int count = sqlSession.delete("deleteByCarNum", "102");
        System.out.println("删除了几条记录：" + count);
    }


    @Test
    public void testUpdateCarByPOJO() {
        // 准备数据
        Car car = new Car();
        car.setId(229L);
        car.setCarNum("102");
        car.setBrand("比亚迪汉");
        car.setGuidePrice(30.23);
        car.setProduceTime("2018-09-10");
        car.setCarType("电车");
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句
        int count = sqlSession.update("updateCarByPOJO", car);
        System.out.println("更新了几条记录：" + count);
    }


    @Test
    public void testSelectCarById() {
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句
        Object car = sqlSession.selectOne("selectCarById", 1);
        System.out.println(car);
    }

    @Test
    public void testSelectCarById1() {
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句
        Object car = sqlSession.selectOne("selectCarById1", 1);
        System.out.println(car);
    }

    @Test
    public void testSelectCarById2() {
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句
        Object car = sqlSession.selectOne("selectCarById2", 1);
        System.out.println(car);
    }

    @Test
    public void testSelectCarAll() {
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句
        List<Object> cars = sqlSession.selectList("selectCarAll");
        // 输出结果
        cars.forEach(System.out::println);
    }

    @Test
    public void testNamespace() {
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句
        List<Object> cars = sqlSession.selectList("selectCarAll");
        // 输出结果
        cars.forEach(car -> System.out.println(car));
    }

    @Test
    public void testNamespace1() {
        // 获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.openSession();
        // 执行SQL语句
        //List<Object> cars = sqlSession.selectList("car.selectCarAll");
        List<Object> cars = sqlSession.selectList("car2.selectCarAll");
        // 输出结果
        cars.forEach(car -> System.out.println(car));
    }
}
