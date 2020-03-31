package dev.hunghh.store.base;

import dev.hunghh.pizza.base.Pizza;

public abstract class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza = CreatePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.Box();
        pizza.Cut();
    }

    protected abstract Pizza CreatePizza(String type);
}
