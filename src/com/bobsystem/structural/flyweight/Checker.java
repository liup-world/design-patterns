package com.bobsystem.structural.flyweight;

import java.util.Map;
import java.util.WeakHashMap;

public class Checker {

    private static final Map<String, Checker> checkerPool =
        new WeakHashMap<String, Checker>();

    private final String name;
    private final int age;

    private Checker(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public static Checker get(String name, int age) {

        String key = name + age;

        Checker worker = Checker.checkerPool.get(key);
        if (worker == null) {

            worker = new Checker(name, age);
            Checker.checkerPool.put(key, worker);
        }

        return worker;
    }
}
