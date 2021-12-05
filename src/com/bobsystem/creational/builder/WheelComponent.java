package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class WheelComponent
    extends AirplanComponent {

    private WheelComponent() { }

    public static class Builder
        implements IAirplanBuilder {

        @Override
        public WheelComponent build() {
            System.out.println("在日本制造了轮子。重 250kg");
            WheelComponent result = new WheelComponent();
            result.setName("日本的轮子");
            return result;
        }
    }

}
