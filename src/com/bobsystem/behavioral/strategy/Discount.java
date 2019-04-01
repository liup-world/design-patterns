package com.bobsystem.behavioral.strategy;

import com.bobsystem.behavioral.strategy.interfaces.IPriceCalculator;

public class Discount
    implements IPriceCalculator {

    private float discount;

    public Discount() {
    }

    public Discount(float discount) {

        this.discount = discount;
    }

    /** 现金收取 */
    public double calculate(double money) {

        return money * discount;
    }

    //region getter setter

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    //endregion
}
