package com.bobsystem.creational.factory_abstract.color;

import com.bobsystem.creational.factory_abstract.color.interfaces.IColor;

public class Purple
    implements IColor {

    Purple() { }

    @Override
    public void paint() {
        System.out.println("paint purple color.");
    }
}
