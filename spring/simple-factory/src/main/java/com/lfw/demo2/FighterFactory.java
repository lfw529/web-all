package com.lfw.demo2;

/**
 * 具体工厂角色
 */
public class FighterFactory implements WeaponFactory {
    @Override
    public Weapon get() {
        return new Fighter();
    }
}