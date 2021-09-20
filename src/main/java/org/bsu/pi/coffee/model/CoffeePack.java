package org.bsu.pi.coffee.model;

import org.bsu.pi.coffee.model.enums.PackType;

public class CoffeePack {

    private Coffee coffee;

    private PackType packType;

    private double volume;

    private double cost;

    public CoffeePack() {
    }

    public CoffeePack(Coffee coffee, PackType packType, double volume, double cost) {
        if (volume <= 0 || cost <= 0) {
            throw new IllegalArgumentException("Negative values.");
        }
        this.coffee = coffee;
        this.packType = packType;
        this.volume = volume;
        this.cost = cost;
    }

    public static class CoffeePackBuilder {

        private final CoffeePack coffeePack;

        public CoffeePackBuilder() {
            coffeePack = new CoffeePack();
        }

        public CoffeePackBuilder coffee(Coffee coffee) {
            coffeePack.coffee = coffee;
            return this;
        }

        public CoffeePackBuilder packType(PackType packType) {
            coffeePack.packType = packType;
            return this;
        }

        public CoffeePackBuilder volume(double volume) {
            coffeePack.volume = volume;
            return this;
        }

        public CoffeePackBuilder cost(double cost) {
            coffeePack.cost = cost;
            return this;
        }

        public CoffeePack build() {
            return coffeePack;
        }
    }

    public static CoffeePackBuilder builder() {
        return new CoffeePackBuilder();
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public PackType getPackType() {
        return packType;
    }

    public double getVolume() {
        return volume;
    }

    public double getCost() {
        return cost;
    }
}
