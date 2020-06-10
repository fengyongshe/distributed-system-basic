package com.fys.hasor.apibinder;

import net.hasor.core.ApiBinder;
import net.hasor.core.binder.ApiBinderCreator;

public class TestBinderCreator implements ApiBinderCreator {

    public ApiBinder createBinder(ApiBinder apiBinder) throws Throwable {
        return new TestBinderImpl(apiBinder);
    }

}
