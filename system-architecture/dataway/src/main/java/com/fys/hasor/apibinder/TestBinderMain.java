package com.fys.hasor.apibinder;

import net.hasor.core.Hasor;

public class TestBinderMain {

    public static void main(String[] args) {
        Hasor.create().mainSettingWith("my-hconfig.xml").build(
                apiBinder -> {
                    TestBinder myBinder = apiBinder.tryCast(TestBinder.class);
                    myBinder.sayHi();
                }
        );
    }
}
