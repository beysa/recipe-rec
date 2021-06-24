package org.acme.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PantryList {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String name;
    double amount;
    String type;
    
    public PantryList() {
    }


    public PantryList(String name) {
        this.name = name;
    }

    public PantryList(String name, double amount, String type) {
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



    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }


    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "PantryFilter [amount=" + amount + ", type=" + type + "]"+ ", name=" + name ;
    }

    
}
