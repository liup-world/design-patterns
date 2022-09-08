package com.bobsystem.creational.singleton;

/**
 * 单例模式 Singleton
 *   保证一个类仅有一个实例，并提供一个访问它的全局访问点
 */
public class Singleton2 {

    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() { }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    public void sumary() {
        System.out.println("利用类初始化机制，保证一个类仅有一个实例，并提供一个访问它的全局访问点。");
    }
}
