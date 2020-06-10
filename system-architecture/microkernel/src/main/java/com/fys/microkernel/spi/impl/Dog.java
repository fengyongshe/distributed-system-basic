package com.fys.microkernel.spi.impl;

import com.fys.microkernel.spi.IShout;

public class Dog implements IShout {

    public void shout() {
        System.out.println("Dog Wangwang!!!");
    }

}
