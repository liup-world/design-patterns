package com.bobsystem.behavioral.visitor;

import com.bobsystem.behavioral.visitor.interfaces.IAmusement;
import com.bobsystem.behavioral.visitor.interfaces.IVisitor;

public class Canoeing
    implements IAmusement {

    @Override
    public void accept(IVisitor visitor) {
        System.out.println("皮划艇准备好接客啦。。。");
        visitor.visit(this);
    }

    @Override
    public void start(String name) {
        System.out.println(name + " 开始划皮划艇了。\r\n");
    }
}
