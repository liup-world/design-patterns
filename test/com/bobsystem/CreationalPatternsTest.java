package com.bobsystem;

import com.bobsystem.creational.builder.Airplan;
import com.bobsystem.creational.builder.AirplanComponent;
import com.bobsystem.creational.builder.WingComponent;
import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

import com.bobsystem.creational.factory_abstract.ISuperFactory;
import com.bobsystem.creational.factory_abstract.SuperFactory;
import com.bobsystem.creational.factory_abstract.color.interfaces.IColor;
import com.bobsystem.creational.factory_abstract.color.interfaces.IColorCreator;
import com.bobsystem.creational.factory_abstract.factory.interfaces.IColorFactory;
import com.bobsystem.creational.factory_abstract.factory.interfaces.IShapeFactory;
import com.bobsystem.creational.factory_abstract.factory.interfaces.IToolFactory;
import com.bobsystem.creational.factory_abstract.shape.interfaces.IShape;
import com.bobsystem.creational.factory_abstract.shape.interfaces.IShapeCreator;
import com.bobsystem.creational.factory_abstract.tool.interfaces.ITool;
import com.bobsystem.creational.factory_abstract.tool.interfaces.IToolCreator;

import com.bobsystem.creational.factory_method.Arithmetic;
import com.bobsystem.creational.factory_method.ArithmeticAddFactory;
import com.bobsystem.creational.factory_method.interfaces.IArithmeticFactory;

import com.bobsystem.creational.factory_simple.OperationFactory;
import com.bobsystem.creational.factory_simple.OperationType;
import com.bobsystem.creational.factory_simple.operation.Operation;

import com.bobsystem.creational.prototype.Prototype;

import com.bobsystem.creational.singleton.Singleton;

import com.bobsystem.creational.singleton.Singleton2;
import com.bobsystem.creational.singleton.Singleton3;
import org.junit.Test;

/**
 * 创建型模式：单例模式、建造者模式、原型模式、3 个工厂模式
 */
public class CreationalPatternsTest {

    /**
     * 建造者模式
     */
    @Test
    public void testBuilder() {
        IAirplanBuilder builder = new Airplan.Builder();
        Airplan airplan = (Airplan) builder.build();
        System.out.println(airplan);

        builder = new WingComponent.Builder();
        AirplanComponent wing = builder.build();
        System.out.println(wing);
    }

    //region 3 个工厂模式
    /**
     * 在工厂方法模式基础之上，将一组相关的对象的创建放入一个工厂。
     */
    @Test
    public void testAbstractFactory() {
        ISuperFactory factory = SuperFactory.instance();

        IShapeFactory shapeFactory = factory.shapeFactory();
        IShapeCreator circleCreator = shapeFactory.circleCreator();
        IShape circle = circleCreator.create();
        circle.draw();

        IColorFactory colorFactory = factory.colorFactory();
        IColorCreator greenCreateor = colorFactory.greenCreator();
        IColor green = greenCreateor.create();
        green.paint();

        IToolFactory toolFactory = factory.toolFactory();
        IToolCreator pencilCreator = toolFactory.pencilCreator();
        ITool pencil = pencilCreator.create();
        pencil.use();
    }

    /**
     * 工厂方法模式，遵循开关原则
     */
    @Test
    public void testFactoryMethod() {
        IArithmeticFactory factory = new ArithmeticAddFactory(); // add operation
        Arithmetic arithmetic = factory.create();
        arithmetic.setNumA(3);
        arithmetic.setNumB(5);
        double result = arithmetic.getResult();
        System.out.println(result);
    }

    /**
     * 简单工厂模式
     */
    @Test
    public void testSimpleFactory() {
        Operation operation = OperationFactory.create(OperationType.divide);
        operation.setNumA(3);
        operation.setNumB(5);
        System.out.println(operation.getResult());
    }
    //endregion 3 个工厂模式

    /**
     * 原型模式
     */
    @Test
    public void testPrototype() {
        Prototype prototype = new Prototype();
        System.out.println(prototype);
        try {
            Prototype prototype2 = prototype.clone();
            System.out.println(prototype2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 单例模式
     */
    @Test
    public void testSingleton() {
        // singleton1 自己维护实例
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        //
        singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        singleton.sumary();
        // singleton2 利用类初始化机制
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton2.hashCode());
        //
        singleton2 = Singleton2.getInstance();
        System.out.println(singleton2.hashCode());
        singleton2.sumary();
        // singleton3 利用枚举实现
        Singleton3 singleton3 = Singleton3.getInstance();
        System.out.println(singleton3.hashCode());
        //
        singleton3 = Singleton3.getInstance();
        System.out.println(singleton3.hashCode());
        singleton3.sumary();
    }
}
