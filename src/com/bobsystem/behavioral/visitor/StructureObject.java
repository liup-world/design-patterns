package com.bobsystem.behavioral.visitor;

import com.bobsystem.behavioral.visitor.interfaces.IElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StructureObject {

    private List<IElement> list;

    public List<IElement> getList() {

        if (this.list == null) {
            this.list = new ArrayList<IElement>();
            Random random = new Random();
            for (int i = 0; i < 10; ++i) {

                int tmp = random.nextInt(100);
                if (tmp > 50) {
                    this.list.add(new Element());
                }
                else {
                    this.list.add(new Element2());
                }
            }
        }
        return this.list;
    }

    public void setList(List<IElement> list) {
        this.list = list;
    }
}
