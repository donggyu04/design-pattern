package com.training.design.pattern.strategy.moving;

public class WalkingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("걷기!");
    }
}
