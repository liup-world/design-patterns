package com.bobsystem.creational.factory_abstract.factory.interfaces;

import com.bobsystem.creational.factory_abstract.shape.interfaces.IShapeCreator;

public interface IShapeFactory {

    IShapeCreator circleCreator();

    IShapeCreator diamondCreator();

    IShapeCreator triangleCreator();

    IShapeCreator rectangleCreator();
}
