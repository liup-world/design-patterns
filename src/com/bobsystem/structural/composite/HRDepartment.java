package com.bobsystem.structural.composite;

public class HRDepartment
    extends ADepartment {

    public HRDepartment(String name){
        super(name);
    }

    @Override
    public void doWork() {

        System.out.println(name + " 员工招聘培训管理");
    }
}
