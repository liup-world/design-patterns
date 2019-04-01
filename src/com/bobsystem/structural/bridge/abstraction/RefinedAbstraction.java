package com.bobsystem.structural.bridge.abstraction;

public class RefinedAbstraction
    extends Abstraction {

    @Override
    public void operation() {

        if (super.implementor != null) {
            super.implementor.operator();
        }
    }
}
