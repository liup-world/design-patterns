package com.bobsystem.behavioral.state;

/**
 * 非线程安全。如要在多线程中访问，请改造。
 */
public class StateContext {

    public static final ALiftState STATE_OPEN = new OpenState();
    public static final ALiftState STATE_RUN = new RunState();
    public static final ALiftState STATE_PAUSE = new PauseState();
    public static final ALiftState STATE_CLOSE = new CloseState();

    private ALiftState state = STATE_CLOSE;

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
