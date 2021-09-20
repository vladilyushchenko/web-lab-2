package org.bsu.pi.coffee;

import org.bsu.pi.coffee.model.Coffee;
import org.bsu.pi.coffee.model.CoffeePack;
import org.bsu.pi.coffee.model.enums.CoffeeSort;
import org.bsu.pi.coffee.model.enums.PackType;

import static org.bsu.pi.coffee.util.CoffeeInitializerUtil.*;

public class App {

    public static void main(String[] args) {
        Coffee portugalCoffee = getPortugalCoffee();
        Coffee brazilCoffee = getBrazilCoffee();
        Coffee columbiaCoffee = getColumbianCoffee();

        CoffeePack portugalCoffeePack = CoffeePack.builder()
                .coffee(portugalCoffee)
                .packType(PackType.PACKAGE)
                .cost(200)
                .volume(200)
                .build();
        CoffeePack brazilCoffeePack = CoffeePack.builder()
                .coffee(brazilCoffee)
                .packType(PackType.JAR)
                .cost(300)
                .volume(300)
                .build();
        CoffeePack columbianCoffeePack = CoffeePack.builder()
                .coffee(columbiaCoffee)
                .packType(PackType.PACKAGE)
                .cost(400)
                .volume(400)
                .build();


    }
}
