package com.bobsystem.structural.composite;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class ADepartment {

    protected final String name;

    protected final List<ADepartment> departments = new ArrayList<ADepartment>();

    public ADepartment(String name){
        this.name = name;
    }

    public void add(ADepartment department) {

        this.departments.add(department);
    }

    // revoke
    public void remove(ADepartment department) {

        this.departments.remove(department);
    }

    // 显示
    public void display(int depth) {

        System.out.println(StringUtils.rightPad("", depth, "-") + this.name);

        for (ADepartment department : this.departments) {

            department.display(depth + 2);
        }
    }

    // 履行职责
    public abstract void doWork();
}
