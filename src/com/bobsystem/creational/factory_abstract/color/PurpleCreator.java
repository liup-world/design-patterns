package com.bobsystem.creational.factory_abstract.color;

import com.bobsystem.creational.factory_abstract.color.interfaces.IColor;
import com.bobsystem.creational.factory_abstract.color.interfaces.IColorCreator;

public class PurpleCreator
    implements IColorCreator {

    @Override
    public IColor create() {
        return new Purple();
    }
}
