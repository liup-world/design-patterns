package com.bobsystem.behavioral.state;

public class RunState
    extends ALiftState {

    @Override
    public void process(StateContext context) {
        System.out.println("current run -> next stop");
        context.setState(StateContext.STATE_PAUSE);
    }
}
