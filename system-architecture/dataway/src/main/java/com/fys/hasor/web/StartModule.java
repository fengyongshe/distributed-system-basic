package com.fys.hasor.web;

import net.hasor.web.WebApiBinder;
import net.hasor.web.WebModule;
import net.hasor.web.annotation.MappingTo;

import java.util.Set;

public class StartModule implements WebModule {

    public void loadModule(WebApiBinder apiBinder) throws Throwable {
        System.out.println("My Web Start...");
        apiBinder.setEncodingCharacter("utf-8", "utf-8");
        Set<Class<?>> aClass = apiBinder.findClass(MappingTo.class);
        apiBinder.loadMappingTo(aClass);
    }

}
