package com.training.design.pattern.command.component;

import com.training.design.pattern.command.command.Command;

public class Button {
    private Command command;

    public Button(Command command) {
        setCommand(command);
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressed() {
        command.execute();
    }
}
