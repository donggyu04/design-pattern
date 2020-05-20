package com.training.design.pattern.command.command;

import com.training.design.pattern.command.component.Alarm;

public class AlarmStartCommand implements Command {
    private Alarm alarm;

    public AlarmStartCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.turnOn();
    }
}
