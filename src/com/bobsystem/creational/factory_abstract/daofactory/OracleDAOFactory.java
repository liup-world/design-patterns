package com.bobsystem.creational.factory_abstract.daofactory;

import com.bobsystem.creational.factory_abstract.dao.OracleDepartmentDAO;
import com.bobsystem.creational.factory_abstract.dao.OracleUserDAO;
import com.bobsystem.creational.factory_abstract.daofactory.interfaces.IDAOFactory;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IDepartmentDAO;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IUserDAO;

public class OracleDAOFactory
    implements IDAOFactory {

    @Override
    public IDepartmentDAO createDepartmentDAO() {

        return new OracleDepartmentDAO();
    }

    @Override
    public IUserDAO createUserDAO() {

        return new OracleUserDAO();
    }
}
