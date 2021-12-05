package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class EngineComponent
    extends AirplanComponent {

    private EngineComponent() { }

    public static class Builder
        implements IAirplanBuilder {

        @Override
        public EngineComponent build() {
            System.out.println("在德国制造了引擎。重 25000kg");
            EngineComponent result = new EngineComponent();
            result.setName("德国的引擎");
            return result;
        }
    }
}
