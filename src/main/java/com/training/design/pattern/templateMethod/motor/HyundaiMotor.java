package com.training.design.pattern.templateMethod.motor;

import com.sun.javafx.scene.traversal.Direction;
import com.training.design.pattern.templateMethod.door.Door;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("현대 모터가 구동 됩니다.");
    }

}
