package com.andresaraujo.hello;

import com.andresaraujo.config.MessagesConfiguration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created with IntelliJ IDEA.
 * User: andres
 * Date: 8/22/13
 * Time: 10:58 AM
 * To change this template use File | Settings | File Templates.
 */
@Path(value = "/hello")
public class HelloResource {

    private final MessagesConfiguration conf;

    public HelloResource(MessagesConfiguration conf) {
        this.conf = conf;
    }

    @GET
    public String sayHello() {
        return conf.getHello();
    }

}
