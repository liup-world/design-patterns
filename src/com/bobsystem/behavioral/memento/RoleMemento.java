package com.bobsystem.behavioral.memento;

public class RoleMemento {

    private final GameRole role;

    public RoleMemento(GameRole role) {
        this.role = role.clone();
    }

    //region getter setter
    public GameRole getRole() {
        return role;
    }
    //endregion
}
