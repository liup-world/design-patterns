package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPainter;

public class GreenPainter
    extends Painter {

    public GreenPainter() {
    }

    public GreenPainter(IPainter painter) {
        super(painter);
    }

    @Override
    public void paint() {
        System.out.println("刷 绿漆");
        super.paint();
    }
}
