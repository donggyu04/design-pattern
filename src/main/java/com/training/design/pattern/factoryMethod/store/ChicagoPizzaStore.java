package com.training.design.pattern.factoryMethod.store;

import com.training.design.pattern.factoryMethod.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        // Make Chicago style pizza.
        return null;
    }
}
