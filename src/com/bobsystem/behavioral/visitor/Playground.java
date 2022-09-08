package com.bobsystem.behavioral.visitor;

import com.bobsystem.behavioral.visitor.interfaces.IAmusement;

import java.util.ArrayList;
import java.util.List;

public class Playground {

    private static List<IAmusement> amusements;

    public static List<IAmusement> getAmusements() {
        List<IAmusement> list = amusements;
        if (list == null) {
            list = new ArrayList<>();
            list.add(new Jumping());
            list.add(new Canoeing());
            amusements = list;
        }
        return list;
    }
}
