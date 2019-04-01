package com.bobsystem.structual;

import com.bobsystem.structural.adapter.CNPlugAdapter;
import com.bobsystem.structural.adapter.HKPlug;
import com.bobsystem.structural.adapter.interfaces.IPlug;
import com.bobsystem.structural.bridge.concrete.ConcreteA;
import com.bobsystem.structural.bridge.concrete.ConcreteB;
import com.bobsystem.structural.bridge.abstraction.RefinedAbstraction;
import com.bobsystem.structural.bridge.abstraction.Abstraction;

import com.bobsystem.structural.composite.Company;
import com.bobsystem.structural.composite.FinanceDepartment;
import com.bobsystem.structural.composite.HRDepartment;
import com.bobsystem.structural.composite.ADepartment;

import com.bobsystem.structural.decorator.BluePaint;
import com.bobsystem.structural.decorator.GreenPaint;
import com.bobsystem.structural.decorator.Paint;
import com.bobsystem.structural.decorator.RedPaint;

import com.bobsystem.structural.facade.Computer;

import com.bobsystem.structural.flyweight.IPhone;
import com.bobsystem.structural.proxy.dynamic.DynamicProxy;
import com.bobsystem.structural.proxy.dynamic.RegisterPerson;
import com.bobsystem.structural.proxy.dynamic.interfaces.IRegister;

import com.bobsystem.structural.proxy.staticc.NiceBoy;
import com.bobsystem.structural.proxy.staticc.BoyProxy;
import com.bobsystem.structural.proxy.staticc.interfaces.IGivingGift;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

// 结构型模式
public class StructualPatternsTest {

    @Test
    public void testAdapter() {

        HKPlug hkPlug = new HKPlug();
        IPlug plug = new CNPlugAdapter(hkPlug);
        plug.smallPin();
    }

    @Test
    public void testBridge() {

        // 小杯咖啡、大杯咖啡、加奶、不加奶
        // Abstraction、RefinedAbstraction 可理解为 咖啡
        // ConcreteA 可理解为 大杯
        // ConcreteB 可理解为 加奶
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteB());
        abstraction.operation();
    }

    @Test
    public void testComposite() {

        ADepartment company = new Company("北京**有限公司");
        company.add(new HRDepartment("总公司人力资源部"));
        company.add(new FinanceDepartment("总公司财务部"));

        ADepartment deptSouthWest = new Company("西南区域");
        company.add(deptSouthWest);

        deptSouthWest.add(new FinanceDepartment("西南区域财务部"));
        deptSouthWest.add(new HRDepartment("西南区域人力资源部"));

        ADepartment deptEast = new Company("华东区域");
        company.add(deptEast);

        deptEast.add(new HRDepartment("华东区域人力资源部"));
        deptEast.add(new FinanceDepartment("华东区域财务部"));

        System.out.println("结构图：");
        company.display(2);

        System.out.println("\n职能：");
        company.doWork();

        System.out.println("一天的工作经过各部门的努力结束了。");
    }

    // 装饰模式
    @Test
    public void testDecorator() {
        Paint redPaint = new RedPaint();
        Paint greenPaint = new GreenPaint(redPaint);
        Paint bluePaint = new BluePaint(greenPaint);
        Paint paint = new Paint(bluePaint);
        paint.paint();
    }

    // 外观模式
    @Test
    public void testFacade() {

        Computer computer = new Computer();
        computer.start();
    }

    // 享元模式
    @Test
    public void testFlyweight() {

        System.out.println("富士康组装了500台iPhone，需要记录它的 串号、芯片信息、质检人员信息");

        for (int i = 1; i <= 500; ++i) {

            IPhone iPhone = new IPhone(StringUtils.leftPad(String.valueOf(i), 10, '0'),
                "6S", 1300, "刘少波", 27);

            if (i % 10 == 0) {

                System.out.println(iPhone);
            }
        }
    }

    @Test
    public void testStaticProxy() {

        NiceBoy boy = new NiceBoy("小芳");

        IGivingGift proxy = new BoyProxy(boy);
        proxy.giveChocolate();
        //proxy.giveDolls();
        //proxy.giveFlowers();
    }

    @Test
    public void testDynamicProxy() {

        DynamicProxy proxy = new DynamicProxy();
        IRegister register = (IRegister)proxy.setTarget(new RegisterPerson());
        register.regist();
    }
}
