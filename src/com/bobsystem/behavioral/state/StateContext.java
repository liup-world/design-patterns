package com.bobsystem.behavioral.state;

public class StateContext {

    public static final ALiftState openState = new OpenState();
    public static final ALiftState closeState = new CloseState();
    public static final ALiftState runState = new RunState();
    public static final ALiftState stopState = new StopState();

    private ALiftState state = closeState;

    public void process() {

        this.state.process(this);
    }

    //region getter setter

    public ALiftState getState() {
        return state;
    }

    public void setState(ALiftState state) {
        this.state = state;
    }
    //endregion
}
