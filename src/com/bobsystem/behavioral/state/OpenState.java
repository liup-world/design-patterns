package com.bobsystem.behavioral.state;

public class OpenState
    extends ALiftState {

    @Override
    public void process(StateContext context) {
        System.out.println("current open -> next run");
        context.setState(StateContext.STATE_RUN);
    }
}
