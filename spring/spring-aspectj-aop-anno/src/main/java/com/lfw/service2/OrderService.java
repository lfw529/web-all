package com.lfw.service2;

import org.springframework.stereotype.Service;

// 目标类
@Service("orderService")
public class OrderService {
    // 目标方法
    public void generate() {
        System.out.println("订单已生成！");
        // 模拟发生异常
        if (1 == 1) {
            throw new RuntimeException("模拟异常发生");
        }
    }
}
