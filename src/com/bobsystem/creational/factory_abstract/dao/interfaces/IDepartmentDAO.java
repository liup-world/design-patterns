package com.bobsystem.creational.factory_abstract.dao.interfaces;

import com.bobsystem.creational.factory_abstract.bean.Department;

public interface IDepartmentDAO {

    void insert(Department department);
    Department get();
}
