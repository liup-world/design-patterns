package com.bobsystem.behavioral.observer;

public class Concreate
    extends ASubject {

    public void setState(String state) {

        if (super.state != null && super.state.equals(state) ||
            state != null && state.equals(super.state) ||
            super.state == null && state == null) {

            return;
        }
        super.state = state;

        System.out.println(state);

        super.notice();
    }
}
