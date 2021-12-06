package com.bobsystem.behavioral.observer;

public class Concreate
    extends ASubject {

    public void setState(String newState) {
        String state = super.state;
        if (state == null && newState == null) return;
        if (state != null && state.equals(newState)) return;
        super.state = newState;
        System.out.println(newState);
        super.notice();
    }
}
