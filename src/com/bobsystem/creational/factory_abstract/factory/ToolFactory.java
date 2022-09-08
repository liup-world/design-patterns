package com.bobsystem.creational.factory_abstract.factory;

import com.bobsystem.creational.factory_abstract.factory.interfaces.IToolFactory;
import com.bobsystem.creational.factory_abstract.tool.BrushCreator;
import com.bobsystem.creational.factory_abstract.tool.PainterCreator;
import com.bobsystem.creational.factory_abstract.tool.PencilCreator;
import com.bobsystem.creational.factory_abstract.tool.interfaces.IToolCreator;

public class ToolFactory
    implements IToolFactory {

    private static final IToolFactory INSTANCE = new ToolFactory();

    //region CONSTANT
    private static final IToolCreator FACTORY_PAINTER = new PainterCreator();
    private static final IToolCreator FACTORY_BRUSH = new BrushCreator();
    private static final IToolCreator FACTORY_PENCIL = new PencilCreator();
    //endregion CONSTANT

    private ToolFactory() { }

    public static IToolFactory instance() {
        return INSTANCE;
    }

    //region member methods
    public IToolCreator painterCreator() {
        return FACTORY_PAINTER;
    }

    public IToolCreator pencilCreator() {
        return FACTORY_PENCIL;
    }

    public IToolCreator brushCreator() {
        return FACTORY_BRUSH;
    }
    //endregion member methods
}
