package com.training.design.pattern.state.state;

public class Saving implements PowerState {
    @Override
    public void powerPush() {
        System.out.println("전원을 끕니다.");
    }
}
