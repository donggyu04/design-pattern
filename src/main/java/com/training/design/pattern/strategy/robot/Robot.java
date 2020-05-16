package com.training.design.pattern.strategy.robot;

import com.training.design.pattern.strategy.attack.AttackStrategy;
import com.training.design.pattern.strategy.moving.MovingStrategy;

public abstract class Robot {
    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    public Robot(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void move() {
        movingStrategy.move();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
}
