package com.bobsystem.creational.factory_abstract.factory.interfaces;

import com.bobsystem.creational.factory_abstract.tool.interfaces.IToolCreator;

public interface IToolFactory {

    IToolCreator painterCreator();

    IToolCreator pencilCreator();

    IToolCreator brushCreator();
}
