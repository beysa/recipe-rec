package org.acme.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/recommend")
public class RecommendRecipe {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "recc";
    }
}
