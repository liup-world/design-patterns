package com.bobsystem.creational.factory_abstract.dao.interfaces;

import com.bobsystem.creational.factory_abstract.bean.User;

public interface IUserDAO {

    void insert(User user);
    User get();
}
