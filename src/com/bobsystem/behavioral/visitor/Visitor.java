package com.bobsystem.behavioral.visitor;

import com.bobsystem.behavioral.visitor.interfaces.IElement;
import com.bobsystem.behavioral.visitor.interfaces.IVisitor;

public class Visitor
    implements IVisitor {

    @Override
    public void visit(IElement element) {

        element.work();
    }
}
