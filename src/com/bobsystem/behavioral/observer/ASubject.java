package com.bobsystem.behavioral.observer;

import com.bobsystem.behavioral.observer.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class ASubject {

    //region property fields
    protected String state;

    private final List<IObserver> observers = new ArrayList<IObserver>();
    //endregion property fields

    //region member methods
    public void attach(IObserver observer) {
        attach(observer, true);
    }

    public void attach(IObserver observer, boolean repeatable) {
        List<IObserver> observers = this.observers;
        if (!repeatable && observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }

    public void detach(IObserver observer) {
        detach(observer, false);
    }

    public void detach(IObserver observer, boolean allSame) {
        List<IObserver> observers = this.observers;
        while (observers.contains(observer)) {
            observers.remove(observer);
            if (!allSame) {
                break;
            }
        }
    }

    protected void notice() {
        for (IObserver observer : this.observers) {
            observer.invoke(this.state);
        }
    }
    //endregion member methods
}
