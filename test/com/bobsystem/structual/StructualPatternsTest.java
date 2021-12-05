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

import com.bobsystem.structural.decorator.BluePainter;
import com.bobsystem.structural.decorator.GreenPainter;
import com.bobsystem.structural.decorator.Painter;
import com.bobsystem.structural.decorator.RedPainter;

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

    /**
     * 桥接模式。解决对象继承在某些业务中，造成混乱，不好维护的问题。
     */
    @Test
    public void testBridge() {
        // 咖啡的规格有：小杯、大杯、加奶、不加奶
        // Abstraction、RefinedAbstraction 可理解为 咖啡
        // ConcreteA 可理解为 加糖
        // ConcreteB 可理解为 加奶
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setProp("大杯咖啡");
        abstraction.setImplementor(new ConcreteA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteB());
        abstraction.operation();
    }

    /**
     * 组合模式。
     *   将拥有树状结构特性的一组数据构建成一棵对象树。
     *   各级负责对子级的调用，简化了调用对象的动作。
     *   可以借助二叉树来理解组合模式。
     */
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

    /**
     * 装饰模式
     */
    @Test
    public void testDecorator() {
        Painter redPainter = new RedPainter();
        Painter greenPainter = new GreenPainter(redPainter);
        Painter bluePainter = new BluePainter(greenPainter);
        Painter painter = new Painter(bluePainter);
        painter.paint();
    }

    /**
     * 外观模式
     */
    @Test
    public void testFacade() {
        Computer computer = new Computer();
        computer.start();
    }

    /**
     * 享元模式。
     *   将对象中重复率高的对象引用缓存起来。减小内存不必要的浪费。
     * 例子中，500 台 iphone 的质检员 与 芯片信息，使用了内存缓存。
     */
    @Test
    public void testFlyweight() {
        System.out.println("富士康组装了 500 台 iPhone，需要记录它的 串号、芯片信息、质检人员信息");
        for (int i = 1; i <= 500; ++i) {
            IPhone iPhone = new IPhone(
                StringUtils.leftPad(String.valueOf(i), 10, '0'),
                "6S", 1300, "刘少波", 27);
            if (i % 10 == 0) {
                System.out.println(iPhone);
            }
        }
    }

    //region proxy pattern
    /**
     * 静态代理 与 动态代理 都是 AOP 的实现。
     */
    @Test
    public void testStaticProxy() {
        NiceBoy boy = new NiceBoy("小芳");
        IGivingGift proxy = new BoyProxy(boy);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }

    @Test
    public void testDynamicProxy() {
        DynamicProxy proxy = new DynamicProxy();
        IRegister register = (IRegister)proxy.setTarget(new RegisterPerson());
        register.regist();
        System.out.println();
        register.makeOfficialSeal();
    }
    //endregion proxy pattern
}
