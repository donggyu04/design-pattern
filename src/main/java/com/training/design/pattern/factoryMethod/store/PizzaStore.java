package com.training.design.pattern.factoryMethod.store;

import com.training.design.pattern.factoryMethod.Pizza;

public abstract class PizzaStore {
    public Pizza order(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    // Factory method.
    abstract public Pizza createPizza(String type);
}
