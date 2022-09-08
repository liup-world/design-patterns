package com.bobsystem.behavioral.interpreter;

import com.bobsystem.behavioral.interpreter.interfaces.IDuck;

public class Duck
    implements IDuck {

    public void right() {
        System.out.println("小鸭子 向右转了 90°。");
    }

    public void swim() {
        System.out.println("小鸭子 游啊游。");
    }

    public void fly() {
        System.out.println("小鸭子 飞走了。");
    }
}
