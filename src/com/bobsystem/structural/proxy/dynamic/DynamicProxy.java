package com.bobsystem.structural.proxy.dynamic;

import com.bobsystem.structural.proxy.dynamic.interfaces.IRegister;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 大致逻辑：
 *   DynamicProxy 实现了 InvocationHandler 接口，
 *   DynamicProxy.setTarget() 返回 Target 的代理对象
 *   在调用 IRegister.regist()时 代理对象的方法生效
 */
public class DynamicProxy
    implements InvocationHandler {

    private IRegister target;

    /**
     * 设置委托人
     * @param target @see inline {@link this.target}
     * @return proxy instance
     */
    public Object setTarget(IRegister target) {

        this.target = target;

        Class clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    // @param object: InvocationHandler implemention
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable {

        System.out.println("*********** begin ***********");

        addMoney();

        Object result = method.invoke(this.target, args);

        revokeMoney();

        System.out.println("************ end ************");

        return result;
    }

    public void addMoney() {

        System.out.println("add money 100w。");
    }

    public void revokeMoney() {

        System.out.println("revoke money 100w。");
    }
}
