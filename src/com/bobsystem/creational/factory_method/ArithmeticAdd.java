package com.bobsystem.creational.factory_method;

public class ArithmeticAdd
    extends Arithmetic {

    ArithmeticAdd() { }

    @Override
    public double getResult() {

        return super.numA + super.numB;
    }
}
