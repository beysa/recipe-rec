package org.acme.domain;

public class DietFilter {
    private Long id;

    String diet_type;

    public DietFilter() {
    }

    public DietFilter(String diet_type) {
        this.diet_type = diet_type;
    }

    public String getDiet_type() {
        return diet_type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDiet_type(String diet_type) {
        this.diet_type = diet_type;
    }

    @Override
    public String toString() {
        return "DietFilter [diet_type=" + diet_type + "]";
    }

}
