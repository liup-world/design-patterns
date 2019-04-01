package com.bobsystem.behavioral.command;

public abstract class ACommand {

    protected final Cook cook;

    protected ACommand(Cook cook){

        this.cook = cook;
    }

    public abstract void execute();
}
