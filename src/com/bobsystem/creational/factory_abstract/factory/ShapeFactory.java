package com.bobsystem.creational.factory_abstract.factory;

import com.bobsystem.creational.factory_abstract.factory.interfaces.IShapeFactory;
import com.bobsystem.creational.factory_abstract.shape.CircleCreator;
import com.bobsystem.creational.factory_abstract.shape.DiamondCreator;
import com.bobsystem.creational.factory_abstract.shape.RectangleCreator;
import com.bobsystem.creational.factory_abstract.shape.TriangleCreator;
import com.bobsystem.creational.factory_abstract.shape.interfaces.IShapeCreator;

public class ShapeFactory
    implements IShapeFactory {

    private static final IShapeFactory INSTANCE = new ShapeFactory();

    //region CONSTANT
    private static final IShapeCreator FACTORY_CIRCLE = new CircleCreator();
    private static final IShapeCreator FACTORY_DIAMOND = new DiamondCreator();
    private static final IShapeCreator FACTORY_TRIANGLE = new TriangleCreator();
    private static final IShapeCreator FACTORY_RECTANGLE = new RectangleCreator();
    //endregion CONSTANT

    private ShapeFactory() { }

    public static IShapeFactory instance() {
        return INSTANCE;
    }

    //region member methods
    @Override
    public IShapeCreator circleCreator() {
        return FACTORY_CIRCLE;
    }

    @Override
    public IShapeCreator diamondCreator() {
        return FACTORY_DIAMOND;
    }

    @Override
    public IShapeCreator triangleCreator() {
        return FACTORY_TRIANGLE;
    }

    @Override
    public IShapeCreator rectangleCreator() {
        return FACTORY_RECTANGLE;
    }
    //endregion member methods
}
