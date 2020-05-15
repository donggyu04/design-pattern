package com.training.design.pattern.decorator;

/**
 * Decorator pattern.
 *
 * 객체에 동적으로 새로운 책임을 추가할 수 있게 합니다.
 * 기능을 추가하려면, 서브클래스를 생성하는 것보다 융통성 있는 방법을 제공합니다.
 *
 * 1. 객체의 타입과 호출 가능한 메소드를 그대로 유지하면서 객체에 새로운 책임을 추가할 때 사용한다.
 * 2. 탈부착 가능한 책임을 정의할 때 사용한다.
 * 3. 상속을 통해 서브클래스를 계속 만드는 방법이 비효율적일 때 사용한다.
 *
 * */
public class Main {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw(); // 기본 도로 표시

        Display roadWithLane = new LaneDecorator(road);
        roadWithLane.draw(); // 기본 도로 표시 + 차선 표시

        Display roadWithTraffic = new TrafficDecorator(roadWithLane);
        roadWithTraffic.draw(); // 기본 도로 표시 + 교통량 표시
    }
}
