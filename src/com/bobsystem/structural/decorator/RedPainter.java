package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPaint;

public class RedPaint
    extends Paint {

    public RedPaint() { }

    public RedPaint(IPaint paint) {
        super(paint);
    }

    @Override
    public void paint() {

        System.out.println("刷 红漆");

        super.paint();
    }
}
