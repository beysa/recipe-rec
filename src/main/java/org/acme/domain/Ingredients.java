package org.acme.domain;

public class Ingredients {
    int ingrId;
    String recipeName;
    String foodName;
    String type;
    String quantity;
    String measure;
    double amount;

    
    public Ingredients() {
    }


    public Ingredients(int ingrId, String recipeName, String foodName, String type, String quantity, String measure,
        double amount) {
        this.ingrId = ingrId;
        this.recipeName = recipeName;
        this.foodName = foodName;
        this.type = type;
        this.quantity = quantity;
        this.measure = measure;
        this.amount = amount;
    }


    public String getRecipeName() {
        return recipeName;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getType() {
        return type;
    }

    public String getQuantity() {
        return quantity;
    }


    public String getMeasure() {
        return measure;
    }

    public double getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        return "Ingredients [amount=" + amount + ", foodName=" + foodName + ", recipeName=" + recipeName + ", type="
                + type + "]";
    }

    
}
