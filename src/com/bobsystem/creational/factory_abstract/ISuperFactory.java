package com.bobsystem.creational.factory_abstract;

import com.bobsystem.creational.factory_abstract.factory.interfaces.IColorFactory;
import com.bobsystem.creational.factory_abstract.factory.interfaces.IShapeFactory;
import com.bobsystem.creational.factory_abstract.factory.interfaces.IToolFactory;

public interface ISuperFactory {

    IShapeFactory shapeFactory();

    IColorFactory colorFactory();

    IToolFactory toolFactory();
}
