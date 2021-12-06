package com.bobsystem.behavioral.state;

public class CloseState
    extends ALiftState {

    @Override
    public void process(StateContext context) {
        System.out.println("current close -> next open");
        context.setState(StateContext.STATE_OPEN);
    }
}
