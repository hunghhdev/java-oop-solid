package dev.hunghh;

public class PizzaStore {
    public void orderPizza(){
        var pizza = new Pizza();
        pizza.prepare();
        pizza.bake();
        pizza.Box();
        pizza.Cut();
    }
}
