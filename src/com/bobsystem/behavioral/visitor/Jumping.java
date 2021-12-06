package com.bobsystem.behavioral.visitor;

import com.bobsystem.behavioral.visitor.interfaces.IAmusement;
import com.bobsystem.behavioral.visitor.interfaces.IVisitor;

public class Jumping
    implements IAmusement {

    @Override
    public void accept(IVisitor visitor) {
        System.out.println("跳楼机准备好接客啦。。。");
        visitor.visit(this);
    }

    @Override
    public void start(String name) {
        System.out.println(name + " 开始玩跳楼机了。\n");
    }
}
