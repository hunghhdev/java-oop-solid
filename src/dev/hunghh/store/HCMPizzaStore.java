package dev.hunghh.store;

import dev.hunghh.pizza.HCMPizza.HCMCheesePizza;
import dev.hunghh.pizza.HCMPizza.HCMGreekPizza;
import dev.hunghh.pizza.HCMPizza.HCMPepperoniPizza;
import dev.hunghh.pizza.base.Pizza;
import dev.hunghh.store.base.PizzaStore;

public class HCMPizzaStore extends PizzaStore {
    @Override
    protected Pizza CreatePizza(String type) {
        switch (type) {
            case "cheese":
                return new HCMCheesePizza();
            case "greek":
                return new HCMGreekPizza();
            case "pepperoni":
                return new HCMPepperoniPizza();
            default:
                return null;
        }
    }
}
