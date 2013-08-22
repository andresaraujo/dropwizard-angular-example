package com.andresaraujo.config;

import com.yammer.dropwizard.config.Configuration;

import javax.validation.Valid;
/**
 * Created with IntelliJ IDEA.
 * User: andres
 * Date: 8/22/13
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class ExampleServiceConfiguration extends Configuration {

    @Valid
    private MessagesConfiguration messages;

    public MessagesConfiguration getMessages() {
        return messages;
    }

    public void setMessages(MessagesConfiguration messages) {
        this.messages = messages;
    }
}
