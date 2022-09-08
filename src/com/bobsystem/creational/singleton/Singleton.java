package com.bobsystem.creational.singleton;

/**
 * 单例模式 Singleton
 *   保证一个类仅有一个实例，并提供一个访问它的全局访问点
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void sumary() {
        System.out.println("通过自己维护实例，保证一个类仅有一个实例，并提供一个访问它的全局访问点。");
    }
}
