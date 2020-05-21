package com.training.design.pattern.templateMethod.motor;

import com.sun.javafx.scene.traversal.Direction;
import com.training.design.pattern.templateMethod.door.Door;
import com.training.design.pattern.templateMethod.door.DoorStatus;

public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    protected abstract void moveMotor(Direction direction);

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        // 이미 이동 중이면 아무 작업을 하지 않음
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        // 만약 문이 열려 있으면 우선 문을 닫음
        if (doorStatus == DoorStatus.OPENED) door.close();

        // Hyundai 모터를 주어진 방향으로 이동시킴
        moveMotor(direction);
        // 모터 상태를 이동 중으로 변경함
        setMotorStatus(MotorStatus.MOVING);
    }
}