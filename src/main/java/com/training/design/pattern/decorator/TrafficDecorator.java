package com.training.design.pattern.decorator;

public class TrafficDecorator extends DisplayDecorator {
    // 기존 표시 클래스의 설정
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw(); // 설정된 기존 표시 기능을 수행
        drawTraffic(); // 추가적으로 교통량을 표시
    }

    // 교통량 표시 기능만 직접 제공
    private void drawTraffic() {
        System.out.println("교통량 표시");
    }
}
