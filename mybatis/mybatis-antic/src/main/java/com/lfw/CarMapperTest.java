package com.lfw;

import com.lfw.mapper.CarMapper;
import com.lfw.pojo.Car;
import com.lfw.util.SqlSessionUtil;
import org.junit.Test;

import java.util.List;

/**
 * CarMapper测试类
 */
public class CarMapperTest {

    @Test
    public void testSelectByCarType() {
        CarMapper mapper = (CarMapper) SqlSessionUtil.openSession().getMapper(CarMapper.class);
        List<Car> cars = mapper.selectByCarType("燃油车");
        cars.forEach(car -> System.out.println(car));
    }

    @Test
    public void testSelectAll() {
        CarMapper mapper = (CarMapper) SqlSessionUtil.openSession().getMapper(CarMapper.class);
        List<Car> cars = mapper.selectAll("desc");
        cars.forEach(car -> System.out.println(car));
    }

    @Test
    public void testSelectAllByTableName() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        List<Car> cars = mapper.selectAllByTableName("t_car");
        cars.forEach(car -> System.out.println(car));
    }

    @Test
    public void testDeleteBatch() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        int count = mapper.deleteBatch("1,2,3");
        System.out.println("删除了几条记录：" + count);
        SqlSessionUtil.openSession().commit();
    }

    @Test
    public void testSelectLikeByBrand() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        List<Car> cars = mapper.selectLikeByBrand("奔驰");
        cars.forEach(car -> System.out.println(car));
    }

    @Test
    public void testInsertUseGeneratedKeys() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        Car car = new Car();
        car.setCarNum("5262");
        car.setBrand("BYD汉");
        car.setGuidePrice(30.3);
        car.setProduceTime("2020-10-11");
        car.setCarType("新能源");
        mapper.insertUseGeneratedKeys(car);
        SqlSessionUtil.openSession().commit();
        System.out.println(car.getId());
    }
}
