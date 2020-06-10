package com.fys.hasor.web;

import net.hasor.web.Invoker;
import net.hasor.web.annotation.MappingTo;

@MappingTo("/hello.jsp")
public class HelloMessage {

    public void execute(Invoker invoker) {
        invoker.put("message", "this message from Project.");
    }

}
