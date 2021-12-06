package com.bobsystem.behavioral.visitor.interfaces;

public interface IAmusement {

    void accept(IVisitor visitor);

    void start(String name);
}
