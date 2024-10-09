package com.lfw.test;

import com.lfw.annotation.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 反射解析注解
 */
public class Test1 {
    public static void main(String[] args) {
        // 存放 Bean 的 Map 集合。key 存储 beanId.value 存储 Bean。
        Map<String, Object> beanMap = new HashMap<>();

        String packageName = "com.lfw.bean";
        String path = packageName.replaceAll("\\.", "/");
        URL url = ClassLoader.getSystemClassLoader().getResource(path);
        File file = new File(url.getPath());
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
            String className = packageName + "." + f.getName().split("\\.")[0];
            try {
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(Component.class)) {
                    Component component = clazz.getAnnotation(Component.class);
                    String beanId = component.value();
                    Object bean = clazz.newInstance();
                    beanMap.put(beanId, bean);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println(beanMap);
    }
}
