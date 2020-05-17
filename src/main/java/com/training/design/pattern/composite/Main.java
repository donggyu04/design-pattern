package com.training.design.pattern.composite;

import com.training.design.pattern.composite.device.Body;
import com.training.design.pattern.composite.device.Computer;
import com.training.design.pattern.composite.device.KeyBoard;
import com.training.design.pattern.composite.device.Monitor;

/**
 * Composite pattern.
 *
 * 여러 개의 객체들로 구성된 복합 객체와 단일 객체를 클라이언트에서 구별 없이 다루게 해주는 패턴.
 *
 * */
public class Main {
    public static void main(String[] args) {
        // 컴퓨터의 부품으로 Keyboard, Body, Monitor 객체를 생성
        KeyBoard keyboard = new KeyBoard(5, 2);
        Body body = new Body(100, 70);
        Monitor monitor = new Monitor(20, 30);

        // Computer 객체를 생성하고 addComponent()를 통해 부품 객체들을 설정
        Computer computer = new Computer();
        computer.addDevice(keyboard);
        computer.addDevice(body);
        computer.addDevice(monitor);

        // 컴퓨터의 가격과 전력 소비량을 구함
        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();
        System.out.println("Computer Price: " + computerPrice + "만원");
        System.out.println("Computer Power: " + computerPower + "W");
    }
}
