package com.fys.hasor.module;

import net.hasor.core.Hasor;

public class MyModuleExample {

    public static void main(String[] args) {
        Hasor.create().build(new FirstModule());
    }

}
