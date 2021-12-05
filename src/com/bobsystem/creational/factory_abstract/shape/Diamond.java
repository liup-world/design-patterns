package com.bobsystem.creational.factory_abstract.shape;

import com.bobsystem.creational.factory_abstract.shape.interfaces.IShape;

public class Diamond
    implements IShape {

    Diamond() { }

    @Override
    public void draw() {
        System.out.println("draw a diamond.");
    }
}
