package com.bobsystem.creational.factory_abstract.color;

import com.bobsystem.creational.factory_abstract.color.interfaces.IColor;

public class Skyblue
    implements IColor {

    Skyblue() { }

    @Override
    public void paint() {
        System.out.println("paint skyblue color.");
    }
}
