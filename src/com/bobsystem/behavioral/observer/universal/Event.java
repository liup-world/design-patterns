package com.bobsystem.behavioral.observer.universal;

import java.lang.reflect.Method;

/**
 * 这个通用的观察者模式，旨在将 java.lang.reflect.Method 对象保存到集合中
 * 在得到主题的通知时，执行所有 Method.invoke()
 */
class Event {

    private final Object object; //要执行方法的对象
    private final String methodName;//方法名
    private final Object[] params;  //要执行方法的参数
    private Class[] paramTypes; //要执行方法的参数的类型

    public Event(Object object, String methodName, Object... params) {

        if (object == null) {
            throw new IllegalArgumentException("object");
        }
        this.object = object;
        this.methodName = methodName;
        this.params = params;

        contractParamTypes(params);
    }

    /**
     * 组装参数类型
     */
    private void contractParamTypes(Object... params) {

        if (params == null || params.length == 0) return;

        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; ++i) {

            paramTypes[i] = params[i].getClass();
        }
    }

    /**
     * 执行指定方法
     */
    void invoke() {

        try {
            Class<?> clazz = this.object.getClass();
            Method method = clazz.getMethod(this.methodName, this.paramTypes);

            if (method == null) {
                return;
            }

            method.invoke(object, params);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
