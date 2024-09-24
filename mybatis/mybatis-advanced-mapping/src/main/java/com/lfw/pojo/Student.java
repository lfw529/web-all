package com.lfw.pojo;

import lombok.*;

/**
 * 学生类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer sid;
    private String sname;
    //......
    @Setter
    @Getter
    private Clazz clazz;

    @Override
    public String toString() {
        return "Student {sid=" + sid + ", sname=" + sname + ", clazz=" + clazz + "}";
    }
}
