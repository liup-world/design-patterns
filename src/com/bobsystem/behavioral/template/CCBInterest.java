package com.bobsystem.behavioral.template;

public class CCBInterest
    extends AAccount {

    // 银行死期存款年利率
    private static final double[][] RATES = {
        // years, interesting
        {5, 0.056},
        {4, 0.053},
        {3, 0.051},
        {2, 0.045},
        {1, 0.036},
        {0.5, 0.034}, // 6个月 半年
        {0.25, 0.032} // 3个月
    };

    public CCBInterest() {
        System.out.println("CCB 建设银行的存款信息如下：");
    }

    @Override
    protected double getInterestRate(final float years) {
        for (double[] arr : RATES) {
            if (years >= arr[0]) {
                return arr[1];
            }
        }
        return 0.005;
    }
}
