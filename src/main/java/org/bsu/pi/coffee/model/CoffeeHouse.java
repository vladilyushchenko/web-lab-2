package org.bsu.pi.coffee.model;

import java.util.List;

public class CoffeeHouse {

    private final List<CoffeePack> packs;

    public CoffeeHouse(List<CoffeePack> packs) {
        this.packs = packs;
    }

    public CoffeePack buyCoffeePack(CoffeePack coffeePack) throws Exception {
        return packs.stream()
                .filter(coffeePack::equals)
                .findFirst()
                .orElseThrow(() -> new Exception("Such coffee is absent"));
    }

    public void addCoffeePack(CoffeePack coffeePack) {
        packs.add(coffeePack);
    }

    public List<CoffeePack> getPacks() {
        return packs;
    }
}
