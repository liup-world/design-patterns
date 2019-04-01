package com.bobsystem.behavioral.observer;

import com.bobsystem.behavioral.observer.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class ASubject {

    protected String state;

    private final List<IObserver> observers = new ArrayList<IObserver>();

    public void attach(IObserver observer) {

        attach(observer, true);
    }

    public void attach(IObserver observer, boolean repeatable) {

        if (!repeatable && this.observers.contains(observer)) {

            return;
        }

        this.observers.add(observer);
    }

    public void detach(IObserver observer) {

        detach(observer, false);
    }

    public void detach(IObserver observer, boolean allSame) {

        while (this.observers.contains(observer)) {

            this.observers.remove(observer);

            if (!allSame) {
                break;
            }
        }
    }

    protected void notice() {

        for (IObserver observer : observers) {

            observer.invoke();
        }
    }
}
