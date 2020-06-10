package com.fys.hasor.module;

import net.hasor.core.Hasor;

public class MyModuleFromConfig {

    public static void main(String[] args) {
        Hasor.create().mainSettingWith("my-hconfig.xml").build();
    }

}
