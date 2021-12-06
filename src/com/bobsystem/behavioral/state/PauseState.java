package com.bobsystem.behavioral.state;

public class PauseState
    extends ALiftState {

    @Override
    public void process(StateContext context) {
        System.out.println("current stop -> next close");
        context.setState(StateContext.STATE_CLOSE);
    }
}
