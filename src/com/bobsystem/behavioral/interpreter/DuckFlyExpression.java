package com.bobsystem.behavioral.interpreter;

import com.bobsystem.behavioral.interpreter.interfaces.IDuck;

public class DuckFlyExpression
    extends AExpression {

    public DuckFlyExpression(IDuck duck) {
        super(duck);
    }

    @Override
    protected void perform(InterpreterContext context) {
        super.duck.fly();
    }
}
