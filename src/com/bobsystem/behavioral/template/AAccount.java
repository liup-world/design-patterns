package com.bobsystem.behavioral.template;

public abstract class AAccount {

    // 算法的骨架
    public double calcInterest(final double amount, final float years) {
        double rate = getInterestRate(years);
        double interest = amount * rate;
        if (years == 0) { // 活期存款
            return interest;
        }
        return interest * years;
    }

    // 延迟到具体的类中去实现
    protected abstract double getInterestRate(final float years);
}
