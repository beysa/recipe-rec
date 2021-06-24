package org.acme.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoryFilter {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String category_name;

    public CategoryFilter() {
    }

    public CategoryFilter(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CategoryFilter [category_name=" + category_name + "]";
    }

}
