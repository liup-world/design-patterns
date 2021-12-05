package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPaint;

public class Painter
    implements IPaint {

    private IPaint paint;

    protected Painter() { }

    public Painter(IPaint paint) {
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
