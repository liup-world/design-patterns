package com.bobsystem.creational.factory_abstract.tool;

import com.bobsystem.creational.factory_abstract.tool.interfaces.ITool;

public class Painter
    implements ITool {

    Painter() { }

    @Override
    public void use() {
        System.out.println("to paint.");
    }
}
