package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPaint;

public class RedPainter
    extends Painter {

    public RedPainter() { }

    public RedPainter(IPaint paint) {
        super(paint);
    }

    @Override
    public void paint() {
        System.out.println("刷 红漆");
        super.paint();
    }
}
