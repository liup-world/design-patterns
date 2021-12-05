package com.bobsystem.creational.factory_abstract.factory.interfaces;

import com.bobsystem.creational.factory_abstract.color.interfaces.IColorCreator;

public interface IColorFactory {

    IColorCreator greenCreator();

    IColorCreator pinkCreator();

    IColorCreator purpleCreator();

    IColorCreator skyBlueCreator();
}
