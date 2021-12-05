package com.bobsystem.creational.factory_method;

import com.bobsystem.creational.factory_method.interfaces.IArithmeticFactory;

public class ArithmeticAddFactory
    implements IArithmeticFactory {

    @Override
    public Arithmetic create() {
        return new ArithmeticAdd();
    }
}
