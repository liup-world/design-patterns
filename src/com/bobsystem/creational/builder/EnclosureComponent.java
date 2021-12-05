package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class EnclosureComponent
    extends AirplanComponent {

    private EnclosureComponent() { }

    public static class Builder
        implements IAirplanBuilder {

        @Override
        public EnclosureComponent build() {
            System.out.println("在美国制造了外壳。重 250t。外壳太大了，制造和运输用了很长时间。");
            EnclosureComponent result = new EnclosureComponent();
            result.setName("美国的外壳");
            return result;
        }
    }

}
