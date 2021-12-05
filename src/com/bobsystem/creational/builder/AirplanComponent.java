package com.bobsystem.creational.builder;

public abstract class AirplanComponent {

    private String name;

    //region member methods
    //region setter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion setter setter

    @Override
    public String toString() {
        return this.name;
    }
    //endregion member methods
}
