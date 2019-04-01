package com.bobsystem.behavioral.interpreter;

import com.bobsystem.behavioral.interpreter.interfaces.IDuck;

public class DuckRightExpression
    extends AExpression {

    public DuckRightExpression(IDuck duck) {
        super(duck);
    }

    @Override
    protected void perform(InterpreterContext context) {

        super.duck.right();
    }
}
