package org.bsu.pi.coffee.service;

import org.bsu.pi.coffee.model.CoffeePack;

import java.util.List;

public interface CoffeeHouseService {

    List<CoffeePack> findAllCoffeePacks();

    List<CoffeePack> findAllSortedCoffeePacks();
}
