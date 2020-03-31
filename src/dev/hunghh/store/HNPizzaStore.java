package dev.hunghh.store;

import dev.hunghh.pizza.HNPizza.HNCheesePizza;
import dev.hunghh.pizza.HNPizza.HNGreekPizza;
import dev.hunghh.pizza.HNPizza.HNPepperoniPizza;
import dev.hunghh.pizza.base.Pizza;
import dev.hunghh.store.base.PizzaStore;

public class HNPizzaStore extends PizzaStore {
    @Override
    protected Pizza CreatePizza(String type) {
        switch (type) {
            case "cheese":
                return new HNCheesePizza();
            case "greek":
                return new HNGreekPizza();
            case "pepperoni":
                return new HNPepperoniPizza();
            default:
                return null;
        }
    }
}
