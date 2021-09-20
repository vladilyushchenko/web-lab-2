package org.bsu.pi.coffee.util;

import org.bsu.pi.coffee.model.Coffee;
import org.bsu.pi.coffee.model.enums.CoffeeSort;

public class CoffeeInitializerUtil {

    public static Coffee getPortugalCoffee() {
        return new Coffee(CoffeeSort.GRAIN, "Portugal");
    }

    public static Coffee getBrazilCoffee() {
        return new Coffee(CoffeeSort.GROUND, "Brazil");
    }

    public static Coffee getColumbianCoffee() {
        return new Coffee(CoffeeSort.GROUND, "Columbia");
    }
}
