package com.bobsystem.creational.factory_abstract;

import com.bobsystem.creational.factory_abstract.factory.ColorFactory;
import com.bobsystem.creational.factory_abstract.factory.interfaces.IColorFactory;
import com.bobsystem.creational.factory_abstract.factory.interfaces.IShapeFactory;
import com.bobsystem.creational.factory_abstract.factory.interfaces.IToolFactory;
import com.bobsystem.creational.factory_abstract.factory.ShapeFactory;
import com.bobsystem.creational.factory_abstract.factory.ToolFactory;

public class SuperFactory
    implements ISuperFactory {

    private static ISuperFactory instance;

    //region CONSTANT
    private static final IShapeFactory FACTORY_SHAPE = ShapeFactory.instance();
    private static final IColorFactory FACTORY_COLOR = ColorFactory.instance();
    private static final IToolFactory FACTORY_Tool = ToolFactory.instance();
    //endregion CONSTANT

    private SuperFactory() { }

    public static ISuperFactory instance() {
        if (instance == null) {
            synchronized (SuperFactory.class) {
                if (instance == null) {
                    instance = new SuperFactory();
                }
            }
        }
        return instance;
    }

    //region member methods
    public IShapeFactory shapeFactory() {
        return FACTORY_SHAPE;
    }

    public IColorFactory colorFactory() {
        return FACTORY_COLOR;
    }

    public IToolFactory toolFactory() {
        return FACTORY_Tool;
    }
    //endregion member methods
}
