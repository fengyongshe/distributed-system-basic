package com.fys.microkernel.spi.impl;

import com.fys.microkernel.spi.IShout;

public class Cat implements IShout {

    public void shout() {
        System.out.println("Cat Miao Miao!!");
    }

}
