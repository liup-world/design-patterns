package com.bobsystem.behavioral.strategy;

import com.bobsystem.behavioral.strategy.interfaces.IPriceCalculator;

public class CashReturn
    implements IPriceCalculator {

    // 金额从大到小 填写
    private static final int[][] returnCash = {
        { 500, 50 },
        { 300, 20 }
    };

    /**
     * 现金收取
     */
    public double calculate(double amount) {

        for (int[] arr : returnCash) {

            int value = arr[0];
            if (amount >= value) {

                int returnn = arr[1];
                return amount - returnn;
            }
        }
        return amount;
    }
}
