package com.bobsystem.creational.factory_abstract.dao;

import com.bobsystem.creational.factory_abstract.dao.interfaces.IDepartmentDAO;
import com.bobsystem.creational.factory_abstract.bean.Department;

public class MySQLDepartmentDAO
    implements IDepartmentDAO {

    @Override
    public void insert(Department department) {

        System.out.println("sql server insert department");
    }

    @Override
    public Department get() {

        System.out.println("sql server query department");
        return null;
    }
}