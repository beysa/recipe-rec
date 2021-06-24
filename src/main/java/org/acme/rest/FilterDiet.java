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
import org.acme.domain.DietFilter;



@Path("/selecteddiet")
public class FilterDiet {

    List<DietFilter> selectedDiets  = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDiets() {
        return Response.ok(selectedDiets).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newDietFilter(DietFilter diet){
        selectedDiets.add(diet);
        return Response.ok(selectedDiets).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteDiet(DietFilter diet){
        selectedDiets.remove(diet);
        return Response.ok(selectedDiets).build();
    }
    
}
