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
import org.acme.domain.PantryList;


@Path("/pantryList")
public class FilterPantry {

    List<PantryList> pantryList  = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDiets() {
        return Response.ok(pantryList).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newDietFilter(PantryList pantry){
        pantryList.add(pantry);
        return Response.ok(pantryList).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteDiet(PantryList pantry){
        pantryList.remove(pantry);
        return Response.ok(pantryList).build();
    }
    
    
}
