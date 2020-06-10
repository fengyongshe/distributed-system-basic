package com.fys.hasor.apibinder;

import net.hasor.core.ApiBinder;
import net.hasor.core.binder.ApiBinderWrap;

public class TestBinderImpl extends ApiBinderWrap implements TestBinder {

    public TestBinderImpl(ApiBinder apiBinder) {
        super(apiBinder);
    }

    public void sayHi() {
        System.out.println("Hello ApiBinder!!!");
    }
}
