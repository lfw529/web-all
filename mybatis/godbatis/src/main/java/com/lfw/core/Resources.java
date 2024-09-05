package com.lfw.core;

import java.io.InputStream;

/**
 * 资源工具类
 */
public class Resources {
    /**
     * 从类路径中获取配置文件的输入流
     *
     * @param config
     * @return 输入流，该输入流指向类路径中的配置文件
     */
    public static InputStream getResourcesAsStream(String config) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(config);
    }
}
