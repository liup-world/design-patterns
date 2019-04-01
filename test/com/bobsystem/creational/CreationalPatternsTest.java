package com.bobsystem.creational;

import com.bobsystem.creational.builder.Airplan;
import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

import com.bobsystem.creational.factory_abstract.daofactory.DAOFactory;
import com.bobsystem.creational.factory_abstract.daofactory.MySQLDAOFactory;
import com.bobsystem.creational.factory_abstract.daofactory.interfaces.IDAOFactory;
import com.bobsystem.creational.factory_abstract.bean.Department;
import com.bobsystem.creational.factory_abstract.bean.User;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IDepartmentDAO;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IUserDAO;

import com.bobsystem.creational.factory_method.Arithom;
import com.bobsystem.creational.factory_method.ArithomAddFactory;
import com.bobsystem.creational.factory_method.interfaces.IArithomFactory;

import com.bobsystem.creational.factory_simple.OperationFactory;
import com.bobsystem.creational.factory_simple.OperationType;
import com.bobsystem.creational.factory_simple.operation.Operation;

import com.bobsystem.creational.prototype.Prototype;

import com.bobsystem.creational.singleton.Singleton;

import org.junit.Test;

// 创建型模式
public class CreationalPatternsTest {

    @Test
    public void testBuilder() {

        IAirplanBuilder builder = new Airplan.Builder();

        Airplan airplan = builder.build();
        System.out.println(airplan);
    }

    @Test
    public void testAbstractFactory() {

        // 第一种 根据配置创建不同数据库的DAO
        IDAOFactory factory = new DAOFactory();

        IDepartmentDAO departmentDAO = factory.createDepartmentDAO();
        departmentDAO.insert(new Department());
        //departmentDAO.get();

        // 第二种 使用具体数据库的工厂创建DAO
        IDAOFactory factory2 = new MySQLDAOFactory();

        IUserDAO userDAO = factory2.createUserDAO();
        userDAO.insert(new User());
        //userDAO.get();
    }

    @Test
    public void testFactoryMethod() {

        IArithomFactory factory = new ArithomAddFactory();

        Arithom arithom = factory.create();
        arithom.setNumA(3);
        arithom.setNumB(5);

        double result = arithom.getResult();
        System.out.println(result);
    }

    @Test
    public void testSimpleFactory() {

        Operation operation = OperationFactory.createOperaion(OperationType.divide);
        operation.setNumA(3);
        operation.setNumB(5);

        double result = operation.getResult();
        System.out.println(result);
    }

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
