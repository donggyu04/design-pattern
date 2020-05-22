package com.training.design.pattern.factoryMethod;

import com.training.design.pattern.factoryMethod.store.ChicagoPizzaStore;
import com.training.design.pattern.factoryMethod.store.NYPizzaStore;
import com.training.design.pattern.factoryMethod.store.PizzaStore;

/**
 * Factory method pattern.
 *
 * 객체 생성을 캡슐화 하는 패턴.
 * */
public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyStore.order("cheese");
        Pizza chicagoPeperoniPizza = chicagoStore.order("pepperoni");
    }
}
