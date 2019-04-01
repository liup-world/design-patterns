package com.bobsystem.structural.proxy.staticc;

import com.bobsystem.structural.proxy.staticc.interfaces.IGivingGift;

public class BoyProxy
    implements IGivingGift {

    private final NiceBoy boy;

    public BoyProxy(NiceBoy boy){

        this.boy = boy;
    }

    @Override
    public void giveFlowers() {

        System.out.println("通过代理");
        this.boy.giveFlowers();
    }

    @Override
    public void giveDolls() {

        System.out.println("通过代理");
        this.boy.giveDolls();
    }

    @Override
    public void giveChocolate() {

        System.out.println("通过代理");
        this.boy.giveChocolate();
    }
}
