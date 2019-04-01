package com.bobsystem.behavioral.visitor;

import com.bobsystem.behavioral.visitor.interfaces.IElement;
import com.bobsystem.behavioral.visitor.interfaces.IVisitor;

public class Element2
    implements IElement {

    @Override
    public void accept(IVisitor visitor) {

        visitor.visit(this);
    }

    @Override
    public void work() {

        System.out.println("element 2 working...");
    }
}
