package com.bobsystem.structural.flyweight;

import java.util.Map;
import java.util.WeakHashMap;

public class Checker {

    // 如应用在多线程环境中应使用线程安全的 map
    private static final
        Map<String, Checker> CACHED_CHECKER = new WeakHashMap<String, Checker>();

    private final String name;
    private final int age;

    private Checker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Checker get(String name, int age) {
        String key = name + age;
        Checker worker = CACHED_CHECKER.get(key);
        if (worker == null) {
            worker = new Checker(name, age);
            CACHED_CHECKER.put(key, worker);
        }
        return worker;
    }
}
