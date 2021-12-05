package com.bobsystem.structural.proxy.staticc;

import com.bobsystem.structural.proxy.staticc.interfaces.IGivingGift;

/**
 * 激动的 Boy
 */
public class NiceBoy
    implements IGivingGift {

    private final String girlFriend;

    public NiceBoy(String girlFriend) {
        this.girlFriend = girlFriend;
    }

    @Override
    public void giveFlowers() {
        System.out.println("真实对象送花给 " + girlFriend);
    }

    @Override
    public void giveDolls() {
        System.out.println("真实对象送玩具熊给 " + girlFriend);
    }

    @Override
    public void giveChocolate() {

        System.out.println("真实对象送巧克力给 " + girlFriend);
    }
}
