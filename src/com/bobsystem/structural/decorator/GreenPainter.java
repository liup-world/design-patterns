package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPaint;

public class GreenPainter
    extends Painter {

    public GreenPainter() {
    }

    public GreenPainter(IPaint paint) {

        super(paint);
    }

    @Override
    public void paint() {

        System.out.println("刷 绿漆");

        super.paint();
    }
}
