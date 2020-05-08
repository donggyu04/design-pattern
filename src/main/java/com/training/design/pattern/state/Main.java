package com.training.design.pattern.state;

import com.training.design.pattern.state.state.Off;
import com.training.design.pattern.state.state.On;
import com.training.design.pattern.state.state.Saving;

/**
 * 스테이트 패턴(State Pattern)
 *
 * 스테이트 패턴은 객체가 특정 상태에 따라 행위를 달리하는 상황에서,
 * 자신이 직접 상태를 체크하여 상태에 따라 행위를 호출하지 않고,
 * 상태를 객체화 하여 상태가 행동을 할 수 있도록 위임하는 패턴을 말합니다.
 *
 * 즉, 객체의 특정 상태를 클래스로 선언하고, 클래스에서는 해당 상태에서 할 수 있는 행위들을 메서드로 정의합니다.
 * 그리고 이러한 각 상태 클래스들을 인터페이스로 캡슐화 하여, 클라이언트에서 인터페이스를 호출하는 방식을 말합니다.
 * 여기서 상태란, 객체가 가질 수 있는 어떤 조건이나 상황을 의미합니다.
 *
 * 출처: https://victorydntmd.tistory.com/294
 */
public class Main {
    public static void main(String[] args) {
        LapTop lapTop = new LapTop();
        On on = new On();
        Off off = new Off();
        Saving saving = new Saving();

        lapTop.powerPush();
        lapTop.changeStateAndPush(on);
        lapTop.changeStateAndPush(saving);
        lapTop.changeStateAndPush(off);
    }
}
