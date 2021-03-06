package com.andresaraujo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.client.JerseyClientConfiguration;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * User: andres
 * Date: 8/22/13 - 10:47 AM
 */
public class AppConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String assetCachePolicy="maximumSize=10000, expireAfterAccess=5s";

    /**
     * How long a session cookie authentication can remain inactive before the user must signin in
     * TODO Implement this
     */
    @NotEmpty
    @JsonProperty
    private String cookieAuthenticationCachePolicy ="maximumSize=10000, expireAfterAccess=600s";

    @Valid
    @NotNull
    @JsonProperty
    private JerseyClientConfiguration httpClient = new JerseyClientConfiguration();

    public String getAssetCachePolicy() {
        return assetCachePolicy;
    }

    public JerseyClientConfiguration getJerseyClientConfiguration() {
        return httpClient;
    }

    public String getCookieAuthenticationCachePolicy() {
        return cookieAuthenticationCachePolicy;
    }

}
