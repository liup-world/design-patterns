package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class AirplanWheelBuilder
    implements IAirplanBuilder {

    private final Airplan airplan;

    public AirplanWheelBuilder(Airplan airplan) {

        this.airplan = airplan;
    }

    @Override
    public Airplan build() {

        System.out.println("在日本制造了轮子。重 250kg");

        this.airplan.setWheel("日本的轮子");

        return this.airplan;
    }
}
