package com.training.design.pattern.flyweight;

/**
 * Flyweight 패턴은 비용이 큰 자원을 공통으로 사용할 수 있도록 만드는 패턴이다.
 *
 * 1. 중복 생성될 가능성이 높은 경우.
 * 2. 자원 생성 비용은 큰데 사용 빈도가 낮은 경우.
 *
 * 이 두가지 목적을 위해서 Flyweight 패턴은 자원 생성과 제공을 책임진다
 * Factory 클래스를 두고, 공
 *
 * */
public class Main {
    public static void main(String[] args) {
        FlyWeight flyWeight = new FlyWeight();
        flyWeight.getSubject("a");
        flyWeight.getSubject("a");
        flyWeight.getSubject("b");
        flyWeight.getSubject("b");

        // FlyWeight 배턴 예
       Integer.valueOf("123");
    }
}
