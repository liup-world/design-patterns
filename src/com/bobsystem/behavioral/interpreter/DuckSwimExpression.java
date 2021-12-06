package com.bobsystem.behavioral.interpreter;

import com.bobsystem.behavioral.interpreter.interfaces.IDuck;

public class DuckSwimExpression
    extends AExpression {

    public DuckSwimExpression(IDuck duck) {
        super(duck);
    }

    @Override
    protected void perform(InterpreterContext context) {

        String[] instructions = context.getInstructions();
        int index = context.getInstructionIndex();

        index += 1;
        String strTimes = instructions[index];

        int times = 1;
        try {
            times = Integer.parseInt(strTimes);
            context.setInstructionIndex(index);
        }
        catch (NumberFormatException ex) {
            ex.fillInStackTrace();
        }
        for (int i = 0; i < times; ++i) {

            super.duck.swim();
        }
    }
}
