package com.bobsystem.creational.factory_simple.operation;

public class OperateDivide
    extends Operation {

    @Override
    public double getResult() {

        if(super.numB == 0){

            System.out.println("除数不能为0");
            return 0;
        }

        return super.numA / super.numB;
    }
}