package com.bobsystem.creational.factory_simple.operation;

public class OperateSubtract
    extends Operation {

    @Override
    public double getResult() {

        return super.numA - super.numB;
    }
}