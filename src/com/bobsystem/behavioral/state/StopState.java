package com.bobsystem.behavioral.state;

public class StopState
    extends ALiftState {

    @Override
    public void process(StateContext context) {

        System.out.println("stop state.. next close");

        context.setState(StateContext.closeState);
    }
}
