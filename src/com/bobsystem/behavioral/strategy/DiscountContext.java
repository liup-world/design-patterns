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

    private int vipLevel;

    private static final IPriceCalculator CASH_RETURN = new CashReturn();
    private static final Discount DISCOUNT = new Discount();

    public double calculate(double price) {

        switch (this.vipLevel) {
            case 1:
                DISCOUNT.setDiscount(0.95f);
                return DISCOUNT.calculate(price);
            case 2:
                DISCOUNT.setDiscount(0.85f);
                return DISCOUNT.calculate(price);
            default:
                return CASH_RETURN.calculate(price);
        }
    }

    //region getter setter

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }
    //endregion
}
