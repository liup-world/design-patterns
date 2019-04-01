package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class AirplanWingBuilder
    implements IAirplanBuilder {

    private final Airplan airplan;

    public AirplanWingBuilder(Airplan airplan) {

        this.airplan = airplan;
    }

    @Override
    public Airplan build() {

        System.out.println("在意大利制造了翅膀。重 25t");

        this.airplan.setWing("意大利的翅膀");

        return this.airplan;
    }
}
