package com.bobsystem.creational.factory_simple;

import com.bobsystem.creational.factory_simple.operation.Operation;
import com.bobsystem.creational.factory_simple.operation.OperateSubtract;
import com.bobsystem.creational.factory_simple.operation.OperateAdd;
import com.bobsystem.creational.factory_simple.operation.OperateDivide;
import com.bobsystem.creational.factory_simple.operation.OperateMultiply;

/**
 * 简单工厂模式，又称静态工厂方法模式
 * 根据外部提供信息决定创建哪一种产品类的实例
 *
 * 加减乘除运算
 */
public class OperationFactory {

    public static Operation create(OperationType type) {

        Operation result = null;
        switch (type.value) {
            case 0:
            default:
                result = new OperateAdd();
                break;
            case 1:
                result = new OperateSubtract();
                break;
            case 2:
                result = new OperateMultiply();
                break;
            case 3:
                result = new OperateDivide();
                break;
        }
        return result;
    }
}
