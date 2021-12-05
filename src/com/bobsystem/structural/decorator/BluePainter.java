package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPaint;

public class BluePaint
    extends Paint {

    public BluePaint() {
    }

    public BluePaint(IPaint paint) {

        super(paint);
    }

    @Override
    public void paint() {

        System.out.println("刷 蓝漆");

        super.paint();
    }
}
