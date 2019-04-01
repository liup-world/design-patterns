package com.bobsystem.creational.factory_simple.operation;

public class OperateMultiply
    extends Operation {

    @Override
    public double getResult() {

        return super.numA * super.numB;
    }
}