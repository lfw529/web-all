package com.lfw.bean;

public class OrderFactory {
    public Order get() {
        return new Order();
    }
}