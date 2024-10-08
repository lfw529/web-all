package com.lfw.demo3;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    public abstract Weapon getWeapon(String type);

    public abstract Fruit getFruit(String type);
}