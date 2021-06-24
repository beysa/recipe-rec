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
import org.acme.domain.CategoryFilter;






@Path("/selectedcategories")
public class FilterCategory {
    //DemoData dd = new DemoData();
    
    List<CategoryFilter> selectedCategories = new ArrayList<>();

    boolean checkExists(List<CategoryFilter> list, CategoryFilter category){
        for(CategoryFilter c : list){
            if(c.getCategory_name().equals(category.getCategory_name())){
                return false;
            }
        }
        return true;
    } 


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCategories() {
        return Response.ok(selectedCategories).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newCategoryFilter(CategoryFilter category){
       // if(selectedCategories){

        //}
        selectedCategories.add(category);
        return Response.ok(selectedCategories).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteCategory(CategoryFilter category){
        selectedCategories.remove(category);
        return Response.ok(selectedCategories).build();
    }

}
