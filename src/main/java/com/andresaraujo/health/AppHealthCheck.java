package com.andresaraujo.health;

import com.yammer.metrics.core.HealthCheck;

/**
 * User: andres
 * Date: 8/23/13 - 12:12 PM
 */
public class AppHealthCheck extends HealthCheck {
    public AppHealthCheck() {
        super("AppHealthCheck");
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
