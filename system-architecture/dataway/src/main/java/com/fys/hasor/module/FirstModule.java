package com.fys.hasor.module;

import net.hasor.core.ApiBinder;
import net.hasor.core.Module;

public class FirstModule implements Module {

    public void loadModule(ApiBinder apiBinder) throws Throwable {
        System.out.println("My FirstModule Loaded !!!");
    }

}
