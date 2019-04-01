package com.bobsystem.behavioral.interpreter;

import com.bobsystem.behavioral.interpreter.interfaces.IDuck;

public abstract class AExpression {

    protected IDuck duck;

    public AExpression(IDuck duck) {
        this.duck = duck;
    }

    public void interpreter(InterpreterContext context) {

        perform(context);
    }

    protected abstract void perform(InterpreterContext context);
}
