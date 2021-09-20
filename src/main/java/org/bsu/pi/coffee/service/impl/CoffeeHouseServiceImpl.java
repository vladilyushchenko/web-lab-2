package org.bsu.pi.coffee.service.impl;

import org.bsu.pi.coffee.model.CoffeeHouse;
import org.bsu.pi.coffee.model.CoffeePack;
import org.bsu.pi.coffee.service.CoffeeHouseService;

import java.util.List;

public class CoffeeHouseServiceImpl implements CoffeeHouseService {

    private final CoffeeHouse coffeeHouse;

    public CoffeeHouseServiceImpl(CoffeeHouse coffeeHouse) {
        this.coffeeHouse = coffeeHouse;
    }

    @Override
    public List<CoffeePack> findAllCoffeePacks() {
        return coffeeHouse.getPacks();
    }

    @Override
    public List<CoffeePack> findAllSortedCoffeePacks() {
        List<CoffeePack> packs = coffeeHouse.getPacks();
        return null;
    }
}
