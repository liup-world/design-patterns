package com.bobsystem.creational.factory_abstract.factory;

import com.bobsystem.creational.factory_abstract.color.GreenCreator;
import com.bobsystem.creational.factory_abstract.color.PinkCreator;
import com.bobsystem.creational.factory_abstract.color.PurpleCreator;
import com.bobsystem.creational.factory_abstract.color.SkyblueCreator;
import com.bobsystem.creational.factory_abstract.color.interfaces.IColorCreator;
import com.bobsystem.creational.factory_abstract.factory.interfaces.IColorFactory;

public class ColorFactory
    implements IColorFactory {

    private static final IColorFactory INSTANCE = new ColorFactory();

    //region CONSTANT
    private static final IColorCreator FACTORY_GREEN = new GreenCreator();
    private static final IColorCreator FACTORY_PINK = new PinkCreator();
    private static final IColorCreator FACTORY_PURPLE = new PurpleCreator();
    private static final IColorCreator FACTORY_SKYBLUE = new SkyblueCreator();
    //endregion CONSTANT

    private ColorFactory() { }

    public static IColorFactory instance() {
        return INSTANCE;
    }

    //region member methods
    public IColorCreator greenCreator() {
        return FACTORY_GREEN;
    }

    public IColorCreator pinkCreator() {
        return FACTORY_PINK;
    }

    public IColorCreator purpleCreator() {
        return FACTORY_PURPLE;
    }

    public IColorCreator skyBlueCreator() {
        return FACTORY_SKYBLUE;
    }
    //endregion member methods
}
