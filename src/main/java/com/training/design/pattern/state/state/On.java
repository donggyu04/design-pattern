package com.training.design.pattern.state.state;

public class On implements PowerState {
    @Override
    public void powerPush() {
        System.out.println("절전 모드로 변경 되었습니다.");
    }
}
