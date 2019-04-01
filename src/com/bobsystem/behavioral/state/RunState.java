package com.bobsystem.behavioral.state;

public class RunState
    extends ALiftState {

    @Override
    public void process(StateContext context) {

        System.out.println("run state.. next stop");

        context.setState(StateContext.stopState);
    }
}
