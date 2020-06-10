package com.fys.hasor.web;

import net.hasor.core.Hasor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebExample {

    public static void main(String[] args) {
        Hasor.create().mainSettingWith("web.xml").build();
        SpringApplication.run(WebExample.class, args);
    }

}
