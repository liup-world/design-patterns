package com.bobsystem.creational.singleton;

/**
 * 单例模式 Singleton
 *   保证一个类仅有一个实例，并提供一个访问它的全局访问点
 */
public enum Singleton3 {

    INSTANCE;

    public static Singleton3 getInstance() {
        return INSTANCE;
    }

    public void sumary() {
        System.out.println("利用枚举实现，保证一个类仅有一个实例，并提供一个访问它的全局访问点。");
    }
}
