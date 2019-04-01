package com.bobsystem.structural.composite;

public class FinanceDepartment
    extends ADepartment {

    public FinanceDepartment(String name){
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(name + " 公司财务收支管理");
    }
}
