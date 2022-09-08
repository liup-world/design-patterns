package com.bobsystem.behavioral.interpreter;

public class InterpreterContext {

    //region property fields
    private AExpression rightExpression;
    private AExpression swimExpression;
    private AExpression flyExpression;

    private String[] instructions;
    private int instructionIndex;
    //endregion property fields

    public InterpreterContext(String instruction) {
        this.instructions = instruction.split("[ ,;]");
    }

    public void interpreter() {
        String[] instructions = this.instructions;
        if (instructions == null || instructions.length == 0) {
            return;
        }
        for (int c = instructions.length; instructionIndex < c; ++instructionIndex) {
            String instruction = instructions[instructionIndex];
            if ("".equals(instruction)) continue;
            if ("right".equals(instruction)) {
                if (this.rightExpression != null) {
                    this.rightExpression.interpreter(this);
                }
                continue;
            }
            if ("swim".equals(instruction)) {
                if (this.swimExpression != null) {
                    this.swimExpression.interpreter(this);
                }
                continue;
            }
            if ("fly".equals(instruction)) {
                if (this.flyExpression != null) {
                    this.flyExpression.interpreter(this);
                }
                //continue;
            }
        }
    }

    //region getter setter
    public void setRightExpression(AExpression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public void setSwimExpression(AExpression swimExpression) {
        this.swimExpression = swimExpression;
    }

    public void setFlyExpression(AExpression flyExpression) {
        this.flyExpression = flyExpression;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }

    public int getInstructionIndex() {
        return instructionIndex;
    }

    public void setInstructionIndex(int instructionIndex) {
        this.instructionIndex = instructionIndex;
    }
    //endregion getter setter
}
