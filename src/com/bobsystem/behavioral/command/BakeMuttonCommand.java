package com.bobsystem.behavioral.command;

public class BakeMuttonCommand
    extends ACommand {

    public BakeMuttonCommand(Cook barbecuer) {
        super(barbecuer);
    }

    @Override
    public void execute() {

        cook.bakeMutton();
    }

    @Override
    public String toString() {
        return "烤串";
    }
}
