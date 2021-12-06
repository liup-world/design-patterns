package com.bobsystem.behavioral.state;

/**
 * 非线程安全。如要在多线程中访问，请改造。
 */
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
