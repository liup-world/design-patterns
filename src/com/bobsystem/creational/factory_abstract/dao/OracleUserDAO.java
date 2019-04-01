package com.bobsystem.creational.factory_abstract.dao;

import com.bobsystem.creational.factory_abstract.bean.User;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IUserDAO;

public class OracleUserDAO
    implements IUserDAO {

    @Override
    public void insert(User user) {

        System.out.println("oracle insert user");
    }

    @Override
    public User get() {

        System.out.println("oracle query user");
        return null;
    }
}
