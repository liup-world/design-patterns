package com.bobsystem.behavioral.command;

public class BakeChickenCommand
    extends ACommand {

    public BakeChickenCommand(Cook barbecuer) {
        super(barbecuer);
    }

    @Override
    public void execute() {
        super.cook.bakeChicken();
    }

    @Override
    public String toString() {
        return "烤鸡";
    }
}
