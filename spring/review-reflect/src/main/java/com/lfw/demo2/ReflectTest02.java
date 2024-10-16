package com.lfw.demo2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("com.lfw.demo2.SystemService");
        Object obj = clazz.newInstance();

        Method loginMethod = clazz.getDeclaredMethod("login", String.class, String.class);

        Object reValue = loginMethod.invoke(obj, "admin", "admin123");

        System.out.println(reValue);
    }
}
