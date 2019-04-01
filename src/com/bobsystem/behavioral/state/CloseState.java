package com.bobsystem.behavioral.state;

public class CloseState
    extends ALiftState {

    @Override
    public void process(StateContext context) {

        System.out.println("close state.. next open");

        context.setState(StateContext.openState);
    }
}
