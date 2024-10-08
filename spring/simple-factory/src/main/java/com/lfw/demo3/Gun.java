package com.lfw.demo3;

/**
 * 武器产品族中的产品等级1
 */
public class Gun extends Weapon {
    @Override
    public void attack() {
        System.out.println("开枪射击！");
    }
}