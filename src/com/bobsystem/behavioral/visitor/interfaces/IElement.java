package com.bobsystem.behavioral.visitor.interfaces;

public interface IElement {

    void accept(IVisitor visitor);

    void work();
}
