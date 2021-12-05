package com.bobsystem.creational.factory_abstract.color;

import com.bobsystem.creational.factory_abstract.color.interfaces.IColor;

public class Pink
    implements IColor {

    Pink() { }

    @Override
    public void paint() {
        System.out.println("paint pink color.");
    }
}
