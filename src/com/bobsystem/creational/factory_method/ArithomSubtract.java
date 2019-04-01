package com.bobsystem.creational.factory_method;

public class ArithomSubtract
    extends Arithom {

    @Override
    public double getResult() {

        return super.numA - super.numB;
    }
}