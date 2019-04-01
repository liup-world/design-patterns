package com.bobsystem.behavioral;

import com.bobsystem.behavioral.command.BakeChickenCommand;
import com.bobsystem.behavioral.command.BakeMuttonCommand;
import com.bobsystem.behavioral.command.ACommand;
import com.bobsystem.behavioral.command.Cook;
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
import com.bobsystem.behavioral.mediator.PlayMovieMediator;
import com.bobsystem.behavioral.mediator.SoundCard;
import com.bobsystem.behavioral.mediator.APlayMovieMediator;

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
import com.bobsystem.behavioral.template.AccountInterest;

import com.bobsystem.behavioral.visitor.StructureObject;
import com.bobsystem.behavioral.visitor.Visitor;
import com.bobsystem.behavioral.visitor.interfaces.IElement;
import com.bobsystem.behavioral.visitor.interfaces.IVisitor;

import java.util.List;

import org.junit.Test;

public class BehavioralPatternsTest {

    @Test
    public void testCommand() {
        ACommand bakeChicken = new BakeChickenCommand(new Cook("康师傅"));
        ACommand bakeMutton = new BakeMuttonCommand(new Cook("老干妈"));

        Waiter waiter = new Waiter(); // 服务员
        waiter.order(bakeChicken);
        waiter.order(bakeMutton);
        waiter.cancelEntry(bakeChicken);
        waiter.commit();
    }

    // 解释器模式
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

    // 中介模式
    @Test
    public void testMediator() {

        APlayMovieMediator mediator = new PlayMovieMediator();
        mediator.setMemory(new Memory(mediator));
        mediator.setCpu(new CPU(mediator));
        mediator.setDisplayCard(new DisplayCard(mediator));
        mediator.setSoundCard(new SoundCard(mediator));

        mediator.play();
    }

    // 备忘录模式
    @Test
    public void testMemento() {

        GameRole role = new GameRole();
        role.initial();

        System.out.println("游戏刚开始，角色各属性：");
        role.show();

        // duplicate role object
        RoleMemento manager = new RoleMemento(role);

        System.out.println("与Boss对战后，角色死亡：");
        role.pkOver();
        role.show();

        System.out.println("满血复活");
        role.recovery(manager.getRole());
        role.show();
    }

    // 观察者模式
    @Test
    public void testObserver() {

        Concreate subject = new Concreate();
        subject.attach(new IObserver() {

            @Override
            public void invoke() {

                System.out.println("坏老师告诉家长。");
            }
        });
        subject.setState("贪睡的学生在睡觉。");
    }

    // 职责链模式
    @Test
    public void testResponsibility() {

        AChain chainA = new ConcreateChainA();
        AChain chainB = new ConcreateChainB();
        AChain chainC = new ConcreateChainC();

        chainA.setChain(chainB);
        chainB.setChain(chainC);

        int[] request = {1, 0, 30, 10, 20, 100, -10};

        for (int i : request) {

            chainA.process(i);
        }
    }

    // 状态模式
    @Test
    public void testState() {

        StateContext context = new StateContext();
        context.process();
        context.process();
        context.process();
        context.process();

        System.out.println();

        context.setState(StateContext.closeState);
        context.process();
        context.process();
    }

    // 策略模式
    @Test
    public void testStrategy() {

        DiscountContext context = new DiscountContext();

        float price = 100;
        System.out.printf("原价 %f 元%n", price);

        context.setVipLevel(1);
        System.out.printf("普通会员享受单价：%f%n", context.calculate(price));

        context.setVipLevel(2);
        System.out.printf("黄金会员享受单价：%f%n", context.calculate(price));

        context.setVipLevel(0);
        System.out.printf("满300减20：%f%n", context.calculate(300));
    }

    // 模板模式
    @Test
    public void testTemplate() {

        AAccount account = new AccountInterest(5000);
        double interest = account.calcInterest();

        System.out.printf("5000元 活期利息是：%f%n", interest);

        account = new AccountInterest(5000d, 1f);
        interest = account.calcInterest();

        System.out.printf("5000元 1年死期利息是：%f%n", interest);

        account = new AccountInterest(5000d, 3f);
        interest = account.calcInterest();

        System.out.printf("5000元 3年死期利息是：%f%n", interest);

        account = new AccountInterest(5000d, 5f);
        interest = account.calcInterest();

        System.out.printf("5000元 5年死期利息是：%f%n", interest);
    }

    @Test
    public void testVisitor() {

        StructureObject object = new StructureObject();
        List<IElement> elements = object.getList();

        IVisitor visitor = new Visitor();
        for (IElement element : elements) {

            element.accept(visitor);
        }
    }
}
