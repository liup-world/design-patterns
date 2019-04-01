package com.bobsystem.creational.factory_method;

public abstract class Arithom {

    protected double numA;
    protected double numB;

    public abstract double getResult();

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
}
