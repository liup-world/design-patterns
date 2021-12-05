package com.bobsystem.creational.prototype;

/**
 * 原型模式：
 *   用原型实例创建对象的种类，并且通过拷贝这些原型创建新的对象
 *   原型其实就是从一个对象再创建另外一个可定制的对象，而且不需知道任何创建的细节
 *
 * 应用场景：
 *   复杂的或者构造时间长的大对象，又或者为在建造者模式中，简化开发人员创建动作的场景下运用，
 *   clone 方法是 native 的，使用二进制拷贝，效率大大提高
 *
 * 使用 Java 的实现原理就是 Clone。
 */
public class Prototype
    implements Cloneable {

    private static final String DESCRIPTION = "原型模式";

    @Override
    public Prototype clone()
        throws CloneNotSupportedException {
        //
        return (Prototype)super.clone();
    }

    @Override
    public String toString() {
        return "Prototype{DESCRIPTION='" + DESCRIPTION + "'}" + this.hashCode();
    }
}
