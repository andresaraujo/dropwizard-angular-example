package com.andresaraujo.resources;

import com.yammer.dropwizard.jersey.caching.CacheControl;
import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * User: andres
 * Date: 8/22/13 - 5:48 PM
 */
@Path("/dummy")
@Produces("application/json; charset=UTF-8")
@Consumes(MediaType.APPLICATION_JSON)
public class DummyResource {
    /**
     * Retrieve
     *
     * @return A paginated representation of all posts
     */
    @GET
    @Timed
    @CacheControl(noCache = true)
    public Map findAll() {
        Map<String,Object> dummy = new HashMap();
        dummy.put("id", 1);
        dummy.put("name", "dummy1");
        return dummy;

    }
}
