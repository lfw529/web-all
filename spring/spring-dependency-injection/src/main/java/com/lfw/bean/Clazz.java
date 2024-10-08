package com.lfw.bean;

/**
 * 表示班级
 */
public class Clazz {
    // 班级名称
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}
