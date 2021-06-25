package org.acme.rest;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.acme.domain.RecipeInfo;

@Path("/recipes")
public class FilterRecipe {

    List<RecipeInfo> allRecipes = new ArrayList<>();


    boolean checkExists(List<RecipeInfo> list, RecipeInfo recipe) {
        for (RecipeInfo r : list) {
            if (r.getRecipeName().equals(recipe.getRecipeName())) {
                return false;
            }
        }
        return true;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRecipes() {
        return Response.ok(allRecipes).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newRecipe(RecipeInfo recipe) {
        if (checkExists(allRecipes, recipe)) {
            allRecipes.add(recipe);
        }

        return Response.ok(allRecipes).build();
    }

}
