package com.bobsystem.creational.factory_abstract.tool;

import com.bobsystem.creational.factory_abstract.tool.interfaces.ITool;

public class Brush
    implements ITool {

    Brush() { }

    @Override
    public void use() {
        System.out.println("to brush.");
    }
}
