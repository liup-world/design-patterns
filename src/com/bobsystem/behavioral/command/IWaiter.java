package com.bobsystem.behavioral.command;

public interface IWaiter {

    void order(ACommand command);
    void cancelEntry(ACommand command);
    void commit();
}
