package com.bobsystem.behavioral.state;

public class OpenState
    extends ALiftState {

    @Override
    public void process(StateContext context) {

        System.out.println("open state.. next run");

        context.setState(StateContext.runState);
    }
}
