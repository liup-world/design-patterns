package com.bobsystem.creational.factory_abstract.daofactory;

import com.bobsystem.creational.factory_abstract.dao.MySQLDepartmentDAO;
import com.bobsystem.creational.factory_abstract.dao.MySQLUserDAO;
import com.bobsystem.creational.factory_abstract.daofactory.interfaces.IDAOFactory;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IDepartmentDAO;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IUserDAO;

public class MySQLDAOFactory
    implements IDAOFactory {

    @Override
    public IDepartmentDAO createDepartmentDAO() {

        return new MySQLDepartmentDAO();
    }

    @Override
    public IUserDAO createUserDAO() {

        return new MySQLUserDAO();
    }
}
