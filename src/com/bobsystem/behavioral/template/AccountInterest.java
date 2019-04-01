package com.bobsystem.behavioral.template;

public class AccountInterest
    extends AAccount {

    // 银行死期存款年利率
    private static final double[][] RATES = {
        {5, 0.055},
        {4, 0.052},
        {3, 0.05},
        {2, 0.044},
        {1, 0.035},
        {0.5, 0.033}, // 6个月 半年
        {0.25, 0.031} // 3个月
    };

    public AccountInterest(double amount) {
        super(amount);
    }

    public AccountInterest(double amount, float years) {
        super(amount, years);
    }

    @Override
    protected double getInterestRate() {

        for (double[] arr : AccountInterest.RATES) {

            double years = arr[0];
            if (super.years >= years) {

                return arr[1];
            }
        }

        return 0.005;
    }
}
