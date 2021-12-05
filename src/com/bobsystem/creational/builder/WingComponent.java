package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class WingComponent
    extends AirplanComponent {

    private WingComponent() { }

    public static class Builder
        implements IAirplanBuilder {

        @Override
        public WingComponent build() {
            System.out.println("在意大利制造了翅膀。重 25t");
            WingComponent result = new WingComponent();
            result.setName("意大利的翅膀");
            return result;
        }
    }
}
