package com.bobsystem.structural.proxy.dynamic;

import com.bobsystem.structural.proxy.dynamic.interfaces.IMakeSeal;
import com.bobsystem.structural.proxy.dynamic.interfaces.IRegist;

public class Register
    implements IRegist, IMakeSeal {

    @Override
    public void regist() {
        System.out.println("i'l regist a compnay.");
    }

    @Override
    public void makeOfficialSeal() {
        System.out.println("help me make official seal.");
    }
}
