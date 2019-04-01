package com.bobsystem.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private final List<ACommand> orders = new ArrayList<ACommand>();

    public void order(ACommand command) {
        if ("BakeChickenCommand".equals(command.toString())) {
            System.out.println("服务员：没有鸡翅了，请点别的");
        }
        else {
            this.orders.add(command);
            System.out.printf("增加订单：%s%n", command);
        }
    }

    public void cancelEntry(ACommand command) {
        if (this.orders.remove(command)) {
            System.out.printf("取消订单：%s%n", command);
        }
    }

    public void commit() {
        for (ACommand command : this.orders) {
            command.execute();
        }
    }
}
