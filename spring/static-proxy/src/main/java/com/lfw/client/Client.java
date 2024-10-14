package com.lfw.client;

import com.lfw.service.OrderService;
import com.lfw.service.OrderServiceImpl;
import com.lfw.service.OrderServiceProxy;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        OrderService target = new OrderServiceImpl();
        // 创建代理对象
        OrderService proxy = new OrderServiceProxy(target);
        // 调用代理对象的代理方法
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
}
