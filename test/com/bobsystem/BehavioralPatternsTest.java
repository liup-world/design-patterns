package com.bobsystem;

import com.bobsystem.behavioral.command.BakeChickenCommand;
import com.bobsystem.behavioral.command.BakeMuttonCommand;
import com.bobsystem.behavioral.command.ACommand;
import com.bobsystem.behavioral.command.Cook;
import com.bobsystem.behavioral.command.IWaiter;
import com.bobsystem.behavioral.command.Waiter;

import com.bobsystem.behavioral.interpreter.Duck;
import com.bobsystem.behavioral.interpreter.DuckFlyExpression;
import com.bobsystem.behavioral.interpreter.DuckRightExpression;
import com.bobsystem.behavioral.interpreter.DuckSwimExpression;
import com.bobsystem.behavioral.interpreter.InterpreterContext;
import com.bobsystem.behavioral.interpreter.interfaces.IDuck;
import com.bobsystem.behavioral.mediator.CPU;
import com.bobsystem.behavioral.mediator.DisplayCard;
import com.bobsystem.behavioral.mediator.Memory;
import com.bobsystem.behavioral.mediator.PlayerMediator;
import com.bobsystem.behavioral.mediator.SoundCard;
import com.bobsystem.behavioral.mediator.APlayerMediator;

import com.bobsystem.behavioral.memento.GameRole;
import com.bobsystem.behavioral.memento.RoleMemento;

import com.bobsystem.behavioral.observer.Concreate;
import com.bobsystem.behavioral.observer.interfaces.IObserver;

import com.bobsystem.behavioral.responsibility.ConcreateChainA;
import com.bobsystem.behavioral.responsibility.ConcreateChainB;
import com.bobsystem.behavioral.responsibility.ConcreateChainC;
import com.bobsystem.behavioral.responsibility.AChain;

import com.bobsystem.behavioral.state.StateContext;

import com.bobsystem.behavioral.strategy.DiscountContext;

import com.bobsystem.behavioral.template.AAccount;
import com.bobsystem.behavioral.template.CCBInterest;
import com.bobsystem.behavioral.template.ICBCInterest;

import com.bobsystem.behavioral.visitor.Playground;
import com.bobsystem.behavioral.visitor.Visitor;
import com.bobsystem.behavioral.visitor.interfaces.IAmusement;
import com.bobsystem.behavioral.visitor.interfaces.IVisitor;

import java.util.List;

import org.junit.Test;

/**
 * 行为型模式。
 *   以是否执行一组业务区分，命令模式、观察者模式、职责链模式、访问者模式 相似。
 *   以是否为 机制-策略 区分，策略模式、状态模式、解释器模式、中介模式 相似。
 *   以互为关系区分，观察者模式、访问者模式 相似。
 */
public class BehavioralPatternsTest {

    /**
     * 命令模式。
     *   将业务请求封装成不同的命令对象，提供“记录、撤销/重做、事务”等处理，
     *     客户端请求时，将命令添加到集合，再一并执行。
     *   同时将过滤命令的过滤器耦合在命令记录的过程中。
     */
    @Test
    public void testCommand() {
        ACommand bakeChicken = new BakeChickenCommand(new Cook("康师傅"));
        ACommand bakeMutton = new BakeMuttonCommand(new Cook("老干妈"));

        IWaiter waiter = new Waiter(); // 服务员
        waiter.order(bakeChicken);
        waiter.order(bakeMutton);
        waiter.cancelEntry(bakeChicken);
        waiter.commit();
    }

    /**
     * 解释器模式
     */
    @Test
    public void testInterpreter() {
        String instruction = "swim 2 right; swim fly 5";

        IDuck duck = new Duck();
        InterpreterContext context = new InterpreterContext(instruction);
        context.setRightExpression(new DuckRightExpression(duck));
        context.setSwimExpression(new DuckSwimExpression(duck));
        context.setFlyExpression(new DuckFlyExpression(duck));

        context.interpreter();
    }

    /**
     * 中介模式。
     *   示例有一个 播放电影的中介对象，还有 内存、CPU、声卡、显卡。
     *   每个具体的硬件内部都引用中介，在执行完任务后，将控制权交给中介，
     *     由中介将该过程处理的结果交给下一过程。
     *   在机制与策略的角度上看，中介对象就是策略，也是耦合发生的地方。
     */
    @Test
    public void testMediator() {
        APlayerMediator mediator = new PlayerMediator();
        mediator.setMemory(new Memory(mediator));
        mediator.setCpu(new CPU(mediator));
        mediator.setDisplayCard(new DisplayCard(mediator));
        mediator.setSoundCard(new SoundCard(mediator));
        mediator.play();
    }

    /**
     * 备忘录模式。
     *   例举一个以前工作中的场景，产品使用了点阵打印机，打印的内容与位置需要一个字符串模板来控制。
     *   模板实际上是一个模式字符串，类似 String.format("pattern str") 的模式字符串。
     *   打印前将占位符替换为值，接着打印下一记录时重复打印了上一条，最后发现是模板污染了。
     *   通过使用备忘录模式解决了这个问题。
     *
     * 示例还使用了原型模式：clone()。
     */
    @Test
    public void testMemento() {
        GameRole role = new GameRole();
        System.out.println("游戏刚开始，角色各属性：");
        role.show();

        // duplicate role object
        RoleMemento manager = new RoleMemento(role);

        System.out.println("与 Boss 对战后，角色死亡：");
        role.pkOver();
        role.show();

        System.out.println("来一颗救生丸，满血复活：");
        role.recovery(manager.getRole());
        role.show();
    }

    /**
     * 观察者模式。
     *   这个模式应该是应用最多的模式，C/S 结构的编程中，所有的事件处理都是这个模式。
     *     如 Android 原生开发、win32、C# 的事件处理机制。JavaScript 事件处理大体上也是。
     *   当系统得到一个事件消息，会执行相应方法，方法中会通知观察者，观察者是用户自定义事件。
     * 观察者模式，一个重要的特征是，可以撤销观察者。
     */
    @Test
    public void testObserver() {
        Concreate subject = new Concreate();
        // attach 一个观察者
        subject.attach(new IObserver() {
            @Override
            public void invoke(String state) {
                System.out.println("“坏”老师告诉家长。" + state);
            }
        });
        IObserver observer = new IObserver() {
            @Override
            public void invoke(String state) {
                System.out.println("同时提醒学生要认真听课。因为：" + state);
            }
        };
        subject.attach(observer);
        subject.attach(observer);
        subject.attach(observer);
        subject.detach(observer); // detach a observer
        subject.setState("贪睡的学生在睡觉。");
        subject.setState("学生又双叕在睡觉。");
    }

    /**
     * 职责链模式。
     *   与 命令模式相似，除了不能撤销命令；
     *   与 装饰模式相似，但职责链的节点可以根据策略直接交给下一节点，而找到职责所在的节点。
     */
    @Test
    public void testResponsibility() {
        AChain chainC = new ConcreateChainC();
        AChain chainB = new ConcreateChainB(chainC);
        AChain chainA = new ConcreateChainA(chainB);
        int[] request = {1, 30, 19, 22};
        for (int i : request) {
            chainA.process(i);
        }
    }

    /**
     * 状态模式。
     *   将不同状态的业务处理封装为不同的对象，避免创建庞大复杂、不易维护的对象。
     *   通过变换状态机的状态，让数据分发到对应的业务。
     */
    @Test
    public void testState() {
        StateContext context = new StateContext();
        context.process();
        context.process();
        context.process();
        context.process();
        System.out.println();

        context.setState(StateContext.STATE_CLOSE);
        context.process();
        context.process();
    }

    /**
     * 策略模式。策略-机制的实现。
     *   将不同的业务处理封装为不同的对象，避免创建庞大复杂、不易维护的对象。
     */
    @Test
    public void testStrategy() {
        float price = 100;
        System.out.printf("原价 %f 元%n", price);

        DiscountContext context = new DiscountContext();
        System.out.println("普通会员享受单价：" +
            context.calculate(price, DiscountContext.VIP_LEVEL_1));
        System.out.println("黄金会员享受单价：" +
            context.calculate(price, DiscountContext.VIP_LEVEL_2));
        System.out.println("满300减20：" +
            context.calculate(300, DiscountContext.VIP_LEVEL_0));
    }

    /**
     * 模板模式。也是一个应用很多的模式，很多模式都有它的样子，如 静态代理，但是很简单。
     *   直接的说就是让一段代码下沉到它的子类中实现，通用的代码写父类，有区别的业务下沉。
     */
    @Test
    public void testTemplate() {
        double deposit = 5000d;
        AAccount account = new ICBCInterest();
        double interest = account.calcInterest(deposit, -1);
        System.out.println("5000元 活期利息是：" + interest);

        interest = account.calcInterest(deposit, 1f);
        System.out.println("5000元 1年死期利息是：" + interest);

        interest = account.calcInterest(deposit, 3f);
        System.out.println("5000元 3年死期利息是：" + interest);
        System.out.println();

        account = new CCBInterest();
        interest = account.calcInterest(deposit, -1);
        System.out.println("5000元 活期利息是：" + interest);

        interest = account.calcInterest(deposit, 1f);
        System.out.println("5000元 1年死期利息是：" + interest);

        interest = account.calcInterest(deposit, 3f);
        System.out.println("5000元 3年死期利息是：" + interest);
    }

    /**
     * 访问者模式。
     *   示例是一个游乐场的所有娱乐活动接受了两个访问者。
     *
     * 访问者模式的逻辑有点绕，被访问者先接待访问者，再由访问者让被访问者启动工作。
     *   伪代码：被访问者.accept() -> 访问者.visit() -> 被访问者.work()
     *
     * 根据具体业务，如果 访问者.visit() 没有初始准备工作，可以省略这一步。
     */
    @Test
    public void testVisitor() {
        List<IAmusement> amusements = Playground.getAmusements();
        IVisitor visitor = new Visitor("展昭");
        IVisitor visitor2 = new Visitor("腰子");
        for (IAmusement amusement : amusements) {
            amusement.accept(visitor);
            amusement.accept(visitor2);
        }
    }
}
