package com.bobsystem.creational.factory_abstract.tool;

import com.bobsystem.creational.factory_abstract.tool.interfaces.ITool;
import com.bobsystem.creational.factory_abstract.tool.interfaces.IToolCreator;

public class BrushCreator
    implements IToolCreator {

    @Override
    public ITool create() {
        return new Brush();
    }
}
