package com.bobsystem.structural.bridge.abstraction;

import com.bobsystem.structural.bridge.concrete.Implementor;

/**
 * 桥接模式(Bridge)
 *   将抽象部分与它的现实部分分离，使它们都可以对立的变化
 *
 * 场景：
 *   一杯咖啡为例，有小杯和大杯之分，同时还有加奶 不加奶之分。
 *   如果用单纯的继承，这四个具体实现(小杯 大杯 加奶 不加奶)之间有概念重叠，因为有小杯加奶，也有小杯不加奶，
 *   如果再在小杯这一层再实现两个继承，很显然混乱，扩展性极差。
 *   那我们使用 Bridge 模式来实现它。
 */
public abstract class Abstraction {

    protected String prop;

    protected Implementor implementor;

    //region member methods
    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
    //endregion member methods

    //region getter setter
    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
    //endregion getter setter
}
