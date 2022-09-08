package com.bobsystem.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 大致逻辑： <br />
 *   此类实现了 {@link InvocationHandler } 接口，
 *   传入被代理对象 {@link DynamicProxy#setTarget(Object) } 返回了它的代理，
 *   也就是 {@link DynamicProxy } 的实例 <br />
 *   在调用被代理对象的任何方法时，
 *   将被 {@link DynamicProxy#invoke(Object, Method, Object[]) } 替代。 <br />
 */
public class DynamicProxy
    implements InvocationHandler {

    private Object target;

    /**
     * 设置委托人
     *
     * @param target 被代理目标 @see {@link DynamicProxy#target }
     * @return proxy instance
     */
    public Object setTarget(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * 在调用被代理人的所有方法，都会进入这个调用。
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        System.out.println("*********** begin ***********");
        this.addMoney();
        Object result = method.invoke(this.target, args);
        this.revokeMoney();
        System.out.println("************ end ************");
        return result;
    }

    private void addMoney() {
        System.out.println("add money 100w。");
    }

    private void revokeMoney() {
        System.out.println("revoke money 100w。");
    }
}
