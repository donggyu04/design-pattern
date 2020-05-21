package com.training.design.pattern.templateMethod;

import com.sun.javafx.scene.traversal.Direction;
import com.training.design.pattern.templateMethod.door.Door;
import com.training.design.pattern.templateMethod.motor.HyundaiMotor;
import com.training.design.pattern.templateMethod.motor.LGMotor;
import com.training.design.pattern.templateMethod.motor.Motor;

/**
 * Template method pattern.
 *
 * 어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 전체 일을 수행하는 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내역을 바꾸는 패턴.
 *
 * */
public class Main {
    public static void main(String[] args) {
        Motor motor = new HyundaiMotor(new Door());
        motor.move(Direction.DOWN);

        motor = new LGMotor(new Door());
        motor.move(Direction.UP);
    }
}
