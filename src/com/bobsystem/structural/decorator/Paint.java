package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPaint;

public class Paint
    implements IPaint {

    private final IPaint paint;

    protected Paint() {
        this.paint = null;
    }

    public Paint(IPaint paint) {
        this.paint = paint;
    }

    @Override
    public void paint() {
        if (this.paint != null) {
            this.paint.paint();
        }
    }
}
