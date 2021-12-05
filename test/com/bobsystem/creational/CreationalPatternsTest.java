package com.bobsystem.creational;

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

import org.junit.Test;

/**
 * 创建型模式：单例模式、建造者模式、原型模式、3 个工厂模式
 */
public class CreationalPatternsTest {

    @Test
    public void testBuilder() {
        IAirplanBuilder builder = new Airplan.Builder();
        Airplan airplan = (Airplan)builder.build();
        System.out.println(airplan);

        builder = new WingComponent.Builder();
        AirplanComponent wing = builder.build();
        System.out.println(wing);
    }

    //region 3 个工厂模式
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

    @Test
    public void testFactoryMethod() {
        IArithmeticFactory factory = new ArithmeticAddFactory();

        Arithmetic arithmetic = factory.create();
        arithmetic.setNumA(3);
        arithmetic.setNumB(5);

        double result = arithmetic.getResult();
        System.out.println(result);
    }

    @Test
    public void testSimpleFactory() {
        Operation operation = OperationFactory.create(OperationType.divide);
        operation.setNumA(3);
        operation.setNumB(5);

        double result = operation.getResult();
        System.out.println(result);
    }
    //endregion 3 个工厂模式

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

    @Test
    public void testSingleton() {

        Singleton singleton = Singleton.getInstance();
        singleton.sumary();
    }
}
