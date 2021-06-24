package org.acme.bootstrap;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.acme.domain.CategoryFilter;





public class DemoData {

    @Transactional
    public List<CategoryFilter> generateDemoData( ) {
        

        List<CategoryFilter> categories = new ArrayList<>();
        categories.add(new CategoryFilter("Kek"));
        categories.add(new CategoryFilter("Tatlı"));
        categories.add(new CategoryFilter("Pasta"));

        return categories;

    }
}
