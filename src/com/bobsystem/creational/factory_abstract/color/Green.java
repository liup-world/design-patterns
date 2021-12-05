package com.bobsystem.creational.factory_abstract.color;

import com.bobsystem.creational.factory_abstract.color.interfaces.IColor;

public class Green
    implements IColor {

    Green() { }

    @Override
    public void paint() {
        System.out.println("paint green color.");
    }
}
