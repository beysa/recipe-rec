package org.acme.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.acme.domain.FoodFilter;

@Path("/allergens")
public class FilterAllergen {
    
    List<FoodFilter> allergens  = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDiets() {
        return Response.ok(allergens).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newDietFilter(FoodFilter allergen){
        allergens.add(allergen);
        return Response.ok(allergens).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteDiet(FoodFilter allergen){
        allergens.remove(allergen);
        return Response.ok(allergens).build();
    }
}
