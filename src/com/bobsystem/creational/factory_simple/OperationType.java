package com.bobsystem.creational.factory_simple;

public enum OperationType {

    add(0), // "+"
    subtract(1), // "-"
    multiply(2), // "*"
    divide(3); // "/"

    int value;

    OperationType(int operation) {

        this.value = operation;
    }
}
