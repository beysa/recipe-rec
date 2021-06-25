package org.acme.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class RecipeInfo extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String recipeName;
    //String instructions;
    //String preptime;
    //String cooktime;
    //String persons;
    String categories;
    //double rate;
    //String imgPath;
    String dietTypes;
    // ArrayList<Ingredients> ingredients;

    public RecipeInfo() {
    }

    public RecipeInfo(String recipeName,String categories,String dietTypes) {
        this.recipeName = recipeName;
        //this.instructions = instructions;
        //this.preptime = preptime;
        //this.cooktime = cooktime;
        //this.persons = persons;
        this.categories = categories;
        //this.rate = rate;
        //this.imgPath = imgPath;
        this.dietTypes = dietTypes;
        // this.ingredients = ingredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    /*
    public String getInstructions() {
        return instructions;
    }
    */

/*     public String getPreptime() {
        return preptime;
    }

    public String getCooktime() {
        return cooktime;
    }

    public String getPersons() {
        return persons;
    } */

    public String getCategories() {
        return categories;
    }

/*     public double getRate() {
        return rate;
    }

    public String getImgPath() {
        return imgPath;
    }
 */
    public String getDietTypes() {
        return dietTypes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RecipeInfo [categories=" + categories + ", dietTypes=" + dietTypes + ", recipeName=" + recipeName + "]";
    }
}
