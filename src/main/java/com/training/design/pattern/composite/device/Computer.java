package com.training.design.pattern.composite.device;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice {
    private List<ComputerDevice> devices = new ArrayList<>();

    public void addDevice(ComputerDevice computerDevice) {
        devices.add(computerDevice);
    }

    public void removeDevice(ComputerDevice computerDevice) {
        devices.remove(computerDevice);
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (ComputerDevice device : devices) {
            price += device.getPrice();
        }
        return price;
    }

    @Override
    public int getPower() {
        int power = 0;
        for (ComputerDevice device : devices) {
            power += device.getPower();
        }
        return power;
    }
}
