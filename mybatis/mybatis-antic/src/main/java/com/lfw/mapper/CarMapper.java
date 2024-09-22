package com.lfw.mapper;

import com.lfw.pojo.Car;

import java.util.List;

/**
 * Car的sql映射对象
 */
public interface CarMapper {

    /**
     * 根据car_num获取Car
     *
     * @param carType
     * @return
     */
    List<Car> selectByCarType(String carType);

    /**
     * 查询所有的Car
     *
     * @param ascOrDesc asc或desc
     * @return
     */
    List<Car> selectAll(String ascOrDesc);

    /**
     * 根据表名查询所有的 Car
     *
     * @param tableName
     * @return
     */
    List<Car> selectAllByTableName(String tableName);

    /**
     * 根据id批量删除
     *
     * @param ids
     * @return
     */
    int deleteBatch(String ids);

    /**
     * 根据品牌进行模糊查询
     *
     * @param likeBrank
     * @return
     */
    List<Car> selectLikeByBrand(String likeBrank);

    /**
     * 获取自动生成的主键
     *
     * @param car
     */
    void insertUseGeneratedKeys(Car car);
}
