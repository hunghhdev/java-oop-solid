package dev.hunghh;

import dev.hunghh.store.HNPizzaStore;

public class PizzaApplication {

    public static void main(String[] args) {
        var pizzaStore = new HNPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("greek");
        pizzaStore.orderPizza("pepperoni");
    }
}
