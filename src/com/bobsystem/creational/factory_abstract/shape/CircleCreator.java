package com.bobsystem.creational.factory_abstract.shape;

import com.bobsystem.creational.factory_abstract.shape.interfaces.IShape;
import com.bobsystem.creational.factory_abstract.shape.interfaces.IShapeCreator;

public class CircleCreator
    implements IShapeCreator {

    @Override
    public IShape create() {
        return new Circle();
    }
}
