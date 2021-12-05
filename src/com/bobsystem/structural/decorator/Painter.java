package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPaint;

public class Paint
    implements IPaint {

    private IPaint paint;

    protected Paint() { }

    public Paint(IPaint paint) {
        this.paint = paint;
    }

    @Override
    public void paint() {
        IPaint paint = this.paint;
        if (paint != null) {
            paint.paint();
        }
    }
}
