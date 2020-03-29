package dev.hunghh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough..." + dough);
        System.out.println("adding sauce..." + sauce);
        System.out.println("adding toppings:");
        Optional.ofNullable(toppings)
                .orElseGet(Collections::emptyList)
                .forEach(topping -> System.out.println("\t" + topping));
    }

    public void bake() {
        System.out.println("Baking " + name + " in 69 minutes");
    }

    public void Cut() {
        System.out.println("Cutting " + name);
    }

    public void Box() {
        System.out.println("Boxing " + name);
    }
}
