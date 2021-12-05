package com.bobsystem.creational.factory_abstract.shape;

import com.bobsystem.creational.factory_abstract.shape.interfaces.IShape;

public class Triangle
    implements IShape {

    Triangle() { }

    @Override
    public void draw() {
        System.out.println("draw a triangle.");
    }
}
