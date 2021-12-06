package com.bobsystem.behavioral.strategy;

import com.bobsystem.behavioral.strategy.interfaces.IPriceCalculator;

/**
 * 策略模式(strategy)：
 *   策略模式定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。
 *   策略模式让算法独立于使用它的客户而独立变化。
 *
 * 理解：
 *   将算法的不同分支封装到不同的对象，降低程序复杂度。
 *
 * 这个例子中，CashReturn 和 Discount 是两个不同的算法。会员使用折扣价，非会员仅能满300减20
 */
public class DiscountContext {

    //region enum
    public static final int VIP_LEVEL_0 = 0;
    public static final int VIP_LEVEL_1 = 1;
    public static final int VIP_LEVEL_2 = 2;
    //endregion enum

    // 满减算法
    private static final IPriceCalculator CASH_RETURN = new CashReturn();

    // 折扣算法
    private static final Discount DISCOUNT = new Discount();

    public double calculate(double price, final int vipLevel) {
        switch (vipLevel) {
            case 1:
                return DISCOUNT.calculate(price, 0.95f);
            case 2:
                return DISCOUNT.calculate(price, 0.85f);
            case 0:
            default:
                return CASH_RETURN.calculate(price, 1);
        }
    }
}
