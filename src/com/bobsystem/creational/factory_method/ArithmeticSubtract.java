package com.bobsystem.creational.factory_method;

public class ArithmeticSubtract
    extends Arithmetic {

    ArithmeticSubtract() { }

    @Override
    public double getResult() {

        return super.numA - super.numB;
    }
}
