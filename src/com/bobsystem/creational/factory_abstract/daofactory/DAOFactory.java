package com.bobsystem.creational.factory_abstract.daofactory;

import com.bobsystem.creational.factory_abstract.daofactory.interfaces.IDAOFactory;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IDepartmentDAO;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IUserDAO;

public class DAOFactory
    implements IDAOFactory {

    private static final String CLASS_FULL_NAME;

    static {
        // 真实场景中 这里可以从配置中读取
        String dbType = "Oracle";

        CLASS_FULL_NAME = String.format(
            "com.bobsystem.creational.factory_abstract.dao.%s", dbType);
    }

    public IUserDAO createUserDAO() {

        try {

            Class clazz = Class.forName(String.format("%sUserDAO", CLASS_FULL_NAME));

            return (IUserDAO)clazz.newInstance();
        }
        catch (Exception ex) {

            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public IDepartmentDAO createDepartmentDAO() {

        try {
            Class clazz = Class.forName(String.format("%sDepartmentDAO", CLASS_FULL_NAME));

            return (IDepartmentDAO)clazz.newInstance();
        }
        catch (Exception ex) {

            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
