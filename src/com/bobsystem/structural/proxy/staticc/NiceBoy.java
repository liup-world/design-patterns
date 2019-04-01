package com.bobsystem.structural.proxy.staticc;

import com.bobsystem.structural.proxy.staticc.interfaces.IGivingGift;

/**
 * 激动的 Boy
 */
public class NiceBoy
    implements IGivingGift {

    private final Girl girl;

    public NiceBoy(String loverName) {

        this.girl = new Girl(loverName);
    }

    @Override
    public void giveFlowers() {

        System.out.println("真实对象送花给 " + girl.getName());
    }

    @Override
    public void giveDolls() {

        System.out.println("真实对象送玩具熊给 " + girl.getName());
    }

    @Override
    public void giveChocolate() {

        System.out.println("真实对象送巧克力给 " + girl.getName());
    }
}
