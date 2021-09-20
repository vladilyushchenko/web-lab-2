package org.bsu.pi.coffee.model;

import org.bsu.pi.coffee.model.enums.CoffeeSort;

public class Coffee {

    private final CoffeeSort sort;

    private final String country;

    public Coffee(CoffeeSort sort, String country) {
        this.country = country;
        this.sort = sort;
    }

    public CoffeeSort getSort() {
        return sort;
    }

    public String getCountry() {
        return country;
    }
}
