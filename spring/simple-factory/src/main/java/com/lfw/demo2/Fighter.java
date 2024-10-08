package com.lfw.demo2;

/**
 * 具体产品角色
 */
public class Fighter extends Weapon {
    @Override
    public void attack() {
        System.out.println("战斗机发射核弹！");
    }
}