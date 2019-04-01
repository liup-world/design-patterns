package com.bobsystem.structural.flyweight;

/**
 * 享元模式(flyweigth)：
 *   运用共享技术有效的支持大量细粒度的对象。
 *
 * 理解：
 *   将重复率高的数据，封装为一个对象，并缓存起来，使用时只需要引用而不用产生新数据，减少内存和时间开销
 *
 * 这个例子中，IPhoneChips 和 Checker 有个缓存机制，仅保存不同的信息
 */
public class IPhone {

    private final String sn;
    private final IPhoneChips model;
    private final Checker checker;

    /**
     * @param manufacturer 芯片厂商
     * @param hertz   芯片频率
     */
    public IPhone(String sn, String manufacturer, int hertz, String checker,
        int checkerAge) {

        this.sn = sn;
        this.model = IPhoneChips.get(manufacturer, hertz);
        this.checker = Checker.get(checker, checkerAge);
    }

    @Override
    public String toString() {
        return String.format("IPhone{sn='%s', model.hashCode=%d, checker.hashCode=%d}';",
            sn, model.hashCode(), checker.hashCode());
    }
}
