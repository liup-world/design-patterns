package com.bobsystem.behavioral.template;

public abstract class AAccount {

    protected final float years;

    // 用户存款数额
    private final double amount;

    public AAccount(double amount) {
        this.amount = amount;
        this.years = 0;
    }

    public AAccount(double amount, float years) {
        this.amount = amount;
        this.years = years;
    }

    // 算法的骨架
    public double calcInterest() {

        double rate = getInterestRate();
        double interest = amount * rate;
        if (this.years == 0) { // 活期存款

            return interest;
        }

        return interest * this.years;
    }

    // 延迟到具体的类中去实现
    protected abstract double getInterestRate();
}
