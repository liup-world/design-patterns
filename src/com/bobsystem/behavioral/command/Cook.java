package com.bobsystem.behavioral.command;

public class Cook {

    private final String name;

    public Cook(String name) {

        this.name = name;
    }

    public void bakeMutton() {

        System.out.printf("厨师 %s 烤肉串%n", this.name);
    }

    public void bakeChicken() {

        System.out.printf("厨师 %s 烤鸡翅%n", this.name);
    }
}
