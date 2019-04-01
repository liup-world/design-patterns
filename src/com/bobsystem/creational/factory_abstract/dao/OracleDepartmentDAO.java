package com.bobsystem.creational.factory_abstract.dao;

import com.bobsystem.creational.factory_abstract.dao.interfaces.IDepartmentDAO;
import com.bobsystem.creational.factory_abstract.bean.Department;

public class OracleDepartmentDAO
    implements IDepartmentDAO {

    @Override
    public void insert(Department department) {

        System.out.println("orcale insert department");
    }

    @Override
    public Department get() {

        System.out.println("orcale query department");
        return null;
    }
}