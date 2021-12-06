package com.bobsystem.behavioral.strategy;

import com.bobsystem.behavioral.strategy.interfaces.IPriceCalculator;

public class Discount
    implements IPriceCalculator {

    public Discount() {
    }

    /** 现金收取 */
    public double calculate(double money, float discount) {
        return money * discount;
    }}
