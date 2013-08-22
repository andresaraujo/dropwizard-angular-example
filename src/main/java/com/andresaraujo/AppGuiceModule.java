package com.andresaraujo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.common.base.Preconditions;
import com.google.inject.AbstractModule;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * User: andres
 * Date: 8/22/13 - 5:05 PM
 */
public class AppGuiceModule extends AbstractModule {

    private final AppConfiguration configuration;

    public AppGuiceModule(String[] args) {

        Preconditions.checkNotNull(args);
        Preconditions.checkElementIndex(1, args.length);

        // Read the YAML configuration
        ObjectMapper om = new ObjectMapper(new YAMLFactory());
        FileInputStream fis;
        try {
            fis = new FileInputStream(args[1]);
            // Stream will be closed on completion
            this.configuration = om.readValue(fis, AppConfiguration.class);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read external configuration from '" + args[1] + "'", e);
        }
    }

    @Override
    protected void configure() {

        // Post cache (only a single instance required)
        //bind(InMemoryPostCache.class).asEagerSingleton();

        // Post support (only a single instance required)
        //bind(PostReadService.class).asEagerSingleton();

    }

}
