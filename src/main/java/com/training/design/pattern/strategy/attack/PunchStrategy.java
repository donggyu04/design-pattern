package com.training.design.pattern.strategy.attack;

public class PunchStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("펀치 공격!");
    }
}
