package com.bobsystem.behavioral.observer.universal;

import java.util.HashSet;
import java.util.Set;

public class EventHandler {

    private Set<Event> events = new HashSet<Event>();

    public void addEvent(Object object, String methodName, Object... params) {

        this.events.add(new Event(object, methodName, params));
    }

    public void notice() {

        for (Event event : this.events) {
            event.invoke();
        }
    }
}
