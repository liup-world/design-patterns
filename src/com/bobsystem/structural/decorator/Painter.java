package com.bobsystem.structural.decorator;

import com.bobsystem.structural.decorator.interfaces.IPainter;

public class Painter
    implements IPainter {

    private IPainter painter;

    protected Painter() { }

    public Painter(IPainter painter) {
        this.painter = painter;
    }

    @Override
    public void paint() {
        IPainter painter = this.painter;
        if (painter != null) {
            painter.paint();
        }
    }
}
