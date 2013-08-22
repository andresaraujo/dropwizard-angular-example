package com.andresaraujo;

import com.hubspot.dropwizard.guice.GuiceBundle;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Project: ${PROJECT_NAME}
 * User: andres
 * Date: 8/22/13 - 10:57 AM
 */
public class AppService extends Service<AppConfiguration> {

    /**
     * The command line arguments to allow DB configuration to take place by Guice
     */
    private String[] args;

    /**
     * Main entry point to the application
     *
     * @param args CLI arguments
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        new AppService(args).run(args);
    }

    /**
     * @param args The command line arguments to allow DB configuration to take place by Guice
     */
    private AppService(String[] args) {
        this.args = args;
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {

        bootstrap.addBundle(GuiceBundle
                .newBuilder()
                .addModule(new AppGuiceModule(args)) // The main Guice module with bindings
                .enableAutoConfig(getClass().getPackage().getName()) // Scan application classes
                .build());

        // Add asset bundles (brought in by the Maven Resources plugin)
        bootstrap.addBundle(new AssetsBundle("/assets","/","index.html"));

    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {

        // Add any specialised configuration here

    }

}

