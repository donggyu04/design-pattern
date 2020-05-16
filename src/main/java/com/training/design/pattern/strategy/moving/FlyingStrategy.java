package com.training.design.pattern.strategy.moving;

public class FlyingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("날다!");
    }
}
