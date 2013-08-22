package com.andresaraujo;

import com.andresaraujo.config.ExampleServiceConfiguration;
import com.andresaraujo.hello.HelloResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Project: ${PROJECT_NAME}
 * User: andres
 * Date: 8/22/13 - 10:57 AM
 */
public class ExampleService extends Service<ExampleServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new ExampleService().run(args);
    }

    @Override
    public void initialize(Bootstrap<ExampleServiceConfiguration> bootstrap) {
        bootstrap.setName("dropwizard-example");
    }

    @Override
    public void run(ExampleServiceConfiguration conf, Environment env) throws Exception {
        env.addResource(new HelloResource(conf.getMessages()));
    }

}

