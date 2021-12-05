package com.bobsystem.creational.factory_abstract.shape;

import com.bobsystem.creational.factory_abstract.shape.interfaces.IShape;

public class Circle
    implements IShape {

    Circle() { }

    @Override
    public void draw() {
        System.out.println("draw a circle.");
    }
}
