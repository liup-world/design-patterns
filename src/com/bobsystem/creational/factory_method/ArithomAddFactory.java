package com.bobsystem.creational.factory_method;

import com.bobsystem.creational.factory_method.interfaces.IArithomFactory;

public class ArithomAddFactory
    implements IArithomFactory {

    @Override
    public Arithom create() {
        return new ArithomAdd();
    }
}
