package com.lfw.test;

import com.lfw.mapper.CarMapper;
import com.lfw.pojo.Car;
import com.lfw.util.SqlSessionUtil;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class CarMapperTest {
    @Test
    public void testSelectById() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        Car car = mapper.selectById(231L);
        System.out.println(car);
    }

    @Test
    public void testSelectByIdToList() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        List<Car> cars = mapper.selectByIdToList(231L);
        System.out.println(cars);
    }

    @Test
    public void testSelectAll() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        List<Car> cars = mapper.selectAll();
        cars.forEach(car -> System.out.println(car));
    }

    @Test
    public void testSelectAll2() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        Car car = mapper.selectAll2();
        System.out.println(car);
    }

    @Test
    public void testSelectByIdRetMap() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        Map<String, Object> car = mapper.selectByIdRetMap(231L);
        System.out.println(car);
    }

    @Test
    public void testSelectAllRetMap() {
        CarMapper mapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        Map<Long, Map<String, Object>> cars = mapper.selectAllRetMap();
        System.out.println(cars);
    }

    @Test
    public void testSelectAllByResultMap() {
        CarMapper carMapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        List<Car> cars = carMapper.selectAllByResultMap();
        System.out.println(cars);
    }

    @Test
    public void testSelectAllByMapUnderscoreToCamelCase() {
        CarMapper carMapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        List<Car> cars = carMapper.selectAllByMapUnderscoreToCamelCase();
        System.out.println(cars);
    }

    @Test
    public void testSelectTotal() {
        CarMapper carMapper = SqlSessionUtil.openSession().getMapper(CarMapper.class);
        Long total = carMapper.selectTotal();
        System.out.println(total);
    }
}
