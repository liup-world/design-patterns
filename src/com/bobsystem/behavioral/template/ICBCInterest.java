package com.bobsystem.behavioral.template;

public class ICBCInterest
    extends AAccount {

    // 银行死期存款年利率
    private static final double[][] RATES = {
        // years, interesting
        {5, 0.055},
        {4, 0.052},
        {3, 0.05},
        {2, 0.044},
        {1, 0.035},
        {0.5, 0.033}, // 6个月 半年
        {0.25, 0.031} // 3个月
    };

    public ICBCInterest() {
        System.out.println("ICBC 工商银行的存款信息如下：");
    }

    @Override
    protected double getInterestRate(final float years) {
        for (double[] arr : RATES) {
            if (years >= arr[0]) {
                return arr[1];
            }
        }
        return 0.0051;
    }
}
