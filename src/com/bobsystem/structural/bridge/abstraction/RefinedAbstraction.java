package com.bobsystem.structural.bridge.abstraction;

import com.bobsystem.structural.bridge.concrete.Implementor;

public class RefinedAbstraction
    extends Abstraction {

    @Override
    public void operation() {
        System.out.println(super.prop + " 在处理。");
        Implementor implementor = super.implementor;
        if (implementor != null) {
            implementor.operator();
        }
    }
}
