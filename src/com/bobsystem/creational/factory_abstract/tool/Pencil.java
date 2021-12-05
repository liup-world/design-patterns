package com.bobsystem.creational.factory_abstract.tool;

import com.bobsystem.creational.factory_abstract.tool.interfaces.ITool;

public class Pencil
    implements ITool {

    Pencil() { }

    @Override
    public void use() {
        System.out.println("to draw.");
    }
}
