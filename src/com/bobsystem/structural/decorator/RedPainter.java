package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPainter;

public class RedPainter
    extends Painter {

    public RedPainter() { }

    public RedPainter(IPainter painter) {
        super(painter);
    }

    @Override
    public void paint() {
        System.out.println("刷 红漆");
        super.paint();
    }
}
