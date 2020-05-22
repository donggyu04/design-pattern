package com.training.design.pattern.factoryMethod.store;

import com.training.design.pattern.factoryMethod.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        // Make NewYork style pizza.
        return null;
    }
}
