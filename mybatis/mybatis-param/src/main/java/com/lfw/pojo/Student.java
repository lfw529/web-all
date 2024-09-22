package com.lfw.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 学生类
 */
@Data
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private Double height;
    private Character sex;
    private Date birth;
    // constructor
    // setter and getter
    // toString
}