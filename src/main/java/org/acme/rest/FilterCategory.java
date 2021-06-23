package org.acme.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.domain.CategoryFilter;

import java.util.ArrayList;
import java.util.List;



@Path("/selectedcategories")
public class FilterCategory {
    
    List<CategoryFilter> selectedCategories = new ArrayList<>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getCategories() {
        return Response.ok(selectedCategories).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newCategoryFilter(CategoryFilter category){
        selectedCategories.add(category);
        return Response.ok(selectedCategories).build();
    }


}
