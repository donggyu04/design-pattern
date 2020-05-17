package com.training.design.pattern.composite.device;

public class KeyBoard extends ComputerDevice {
    private int price;
    private int power;

    public KeyBoard(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}
