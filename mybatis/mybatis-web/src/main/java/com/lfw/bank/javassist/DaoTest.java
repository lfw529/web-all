package com.lfw.bank.javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.Modifier;

import java.lang.reflect.Method;

public class DaoTest extends Exception {
    public static void main(String[] args) {
        ClassPool pool = ClassPool.getDefault();
        // 创建类
        CtClass ctClass = pool.makeClass("com.lfw.bank.dao.impl.AccountDaoImpl");
        // 制造接口
        CtClass ctInterface = pool.makeInterface("com.lfw.bank.dao.AccountDao");

        ctClass.addInterface(ctInterface);   // 相当于 AccountDaoImpl implements AccountDao
        // 获取所有的方法
        Method[] methods = daoInterface.getDeclaredMethods();
    }
}
