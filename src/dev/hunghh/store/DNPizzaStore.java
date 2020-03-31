package dev.hunghh.store;

import dev.hunghh.pizza.DNPizza.DNCheesePizza;
import dev.hunghh.pizza.DNPizza.DNGreekPizza;
import dev.hunghh.pizza.DNPizza.DNPepperoniPizza;
import dev.hunghh.pizza.base.Pizza;
import dev.hunghh.store.base.PizzaStore;

public class DNPizzaStore extends PizzaStore {
    @Override
    protected Pizza CreatePizza(String type) {
        switch (type) {
            case "cheese":
                return new DNCheesePizza();
            case "greek":
                return new DNGreekPizza();
            case "pepperoni":
                return new DNPepperoniPizza();
            default:
                return null;
        }
    }
}
