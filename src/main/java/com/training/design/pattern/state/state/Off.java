package com.training.design.pattern.state.state;

public class Off implements PowerState {
    @Override
    public void powerPush() {
        System.out.println("전원을 킵니다.");
    }
}
