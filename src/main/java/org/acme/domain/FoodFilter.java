package org.acme.domain;

public class FoodFilter {
    


    String name;
    double amount;
    String type;
    
    public FoodFilter() {
    }

    


    public FoodFilter(String name) {
        this.name = name;
    }




    public FoodFilter(String name, double amount, String type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }


    @Override
    public String toString() {
        return "PantryFilter [amount=" + amount + ", type=" + type + "]"+ ", name=" + name ;
    }

    
}
