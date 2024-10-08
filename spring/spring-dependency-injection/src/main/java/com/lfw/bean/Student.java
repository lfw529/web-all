package com.lfw.bean;

/**
 * 表示学生
 */

public class Student {
    private String name;

    // 学生属于哪个班级
    private Clazz clazz;

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    // 使用级联属性赋值，这个需要这个get方法。
    public Clazz getClazz() {
        return clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
