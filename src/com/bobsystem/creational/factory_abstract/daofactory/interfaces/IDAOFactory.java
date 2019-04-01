package com.bobsystem.creational.factory_abstract.daofactory.interfaces;

import com.bobsystem.creational.factory_abstract.dao.interfaces.IDepartmentDAO;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IUserDAO;

public interface IDAOFactory {

    IUserDAO createUserDAO();

    IDepartmentDAO createDepartmentDAO();
}
