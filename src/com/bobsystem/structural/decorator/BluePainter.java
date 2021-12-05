package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPaint;

public class BluePainter
    extends Painter {

    public BluePainter() {
    }

    public BluePainter(IPaint paint) {

        super(paint);
    }

    @Override
    public void paint() {

        System.out.println("刷 蓝漆");

        super.paint();
    }
}
