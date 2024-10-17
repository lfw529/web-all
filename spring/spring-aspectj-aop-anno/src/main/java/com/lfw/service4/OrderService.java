package com.lfw.service4;

import org.springframework.stereotype.Service;

// 目标类
@Service("orderService")
public class OrderService {
    // 目标方法
    public void generate() {
        System.out.println("订单已生成！");
    }
}
