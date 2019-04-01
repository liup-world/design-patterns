package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class AirplanEngineBuilder
    implements IAirplanBuilder {

    private final Airplan airplan;

    public AirplanEngineBuilder(Airplan airplan) {

        this.airplan = airplan;
    }

    @Override
    public Airplan build() {

        System.out.println("在德国制造了引擎。重 25000kg");

        this.airplan.setEngine("德国的引擎");

        return this.airplan;
    }
}
