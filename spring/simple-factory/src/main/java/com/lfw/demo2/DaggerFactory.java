package com.lfw.demo2;

public class DaggerFactory implements WeaponFactory {
    @Override
    public Weapon get() {
        return new Dagger();
    }
}
