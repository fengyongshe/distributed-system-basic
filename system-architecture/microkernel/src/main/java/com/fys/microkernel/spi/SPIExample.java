package com.fys.microkernel.spi;

import java.util.ServiceLoader;

public class SPIExample {

    public static void main(String[] args) {
        ServiceLoader<IShout> shouts = ServiceLoader.load(IShout.class);
        for (IShout ishout: shouts) {
            ishout.shout();
        }
    }
}
