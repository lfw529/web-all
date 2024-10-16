package com.lfw.demo2;

import java.lang.reflect.Method;

public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.lfw.demo2.SystemService");
        Object obj = clazz.newInstance();
        Method logoutMethod = clazz.getDeclaredMethod("logout");
        logoutMethod.invoke(obj);
    }
}
