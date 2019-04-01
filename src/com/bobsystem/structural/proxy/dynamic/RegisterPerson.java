package com.bobsystem.structural.proxy.dynamic;

import com.bobsystem.structural.proxy.dynamic.interfaces.IRegister;

public class RegisterPerson
    implements IRegister {

    @Override
    public void regist() {

        System.out.println("i'l regist a compnay。");
    }
}
