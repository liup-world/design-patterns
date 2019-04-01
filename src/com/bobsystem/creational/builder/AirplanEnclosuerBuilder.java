package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class AirplanEnclosuerBuilder
    implements IAirplanBuilder {

    private final Airplan airplan;

    public AirplanEnclosuerBuilder(Airplan airplan) {

        this.airplan = airplan;
    }

    @Override
    public Airplan build() {

        System.out.println("在美国制造了外壳。重 250t。外壳太大了，制造和运输用了很长时间。");

        this.airplan.setEnclosure("美国的外壳");

        return this.airplan;
    }
}
