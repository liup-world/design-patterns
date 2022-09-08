package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPainter;

public class BluePainter
    extends Painter {

    public BluePainter() {
    }

    public BluePainter(IPainter paint) {

        super(paint);
    }

    @Override
    public void paint() {

        System.out.println("刷 蓝漆");

        super.paint();
    }
}
