package com.bobsystem.creational.factory_abstract.shape;

import com.bobsystem.creational.factory_abstract.shape.interfaces.IShape;

public class Rectangle
    implements IShape {

    Rectangle() { }

    @Override
    public void draw() {
        System.out.println("draw a rectangle.");
    }
}
