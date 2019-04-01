package com.bobsystem.creational.factory_abstract.dao;

import com.bobsystem.creational.factory_abstract.bean.User;
import com.bobsystem.creational.factory_abstract.dao.interfaces.IUserDAO;

public class MySQLUserDAO
    implements IUserDAO {

    @Override
    public void insert(User user) {

        System.out.println("mysql insert user");
    }

    @Override
    public User get() {

        System.out.println("mysql query user");
        return null;
    }
}