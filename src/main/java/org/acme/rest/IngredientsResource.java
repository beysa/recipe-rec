package org.acme.rest;

import io.smallrye.mutiny.Multi;
import io.vertx.mutiny.pgclient.PgPool;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.Path;
import org.acme.domain.Ingredients;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("/ingredients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IngredientsResource {

    @Inject
    PgPool client;

    @PostConstruct
    void configure() {
       initdb();
    }
    
    private void initdb() {
       client.query("CREATE TABLE IF NOT EXISTS ingredients").execute().await().indefinitely();
    }

    public Multi<Ingredients> get() {
        return Ingredients.findAll(client);
    } 

}
