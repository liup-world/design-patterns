package com.bobsystem.behavioral.visitor;

import com.bobsystem.behavioral.visitor.interfaces.IAmusement;
import com.bobsystem.behavioral.visitor.interfaces.IVisitor;

public class Visitor
    implements IVisitor {

    private final String name;

    public Visitor(String name) {
        this.name = name;
    }

    @Override
    public void visit(IAmusement element) {
        element.start(this.name);
    }
}
