package com.training.design.pattern.decorator;

public class LaneDecorator extends DisplayDecorator {
    // 기존 표시 클래스의 설정
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw(); // 설정된 기존 표시 기능을 수행
        drawLane(); // 추가적으로 차선을 표시
    }

    // 차선 표시 기능만 직접 제공
    private void drawLane() {
        System.out.println("차선 표시");
    }
}
