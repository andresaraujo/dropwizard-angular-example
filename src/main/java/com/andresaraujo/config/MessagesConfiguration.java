package com.andresaraujo.config;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: andres
 * Date: 8/22/13
 * Time: 10:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class MessagesConfiguration {

    @NotNull
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
