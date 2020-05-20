package com.training.design.pattern.command;

import com.training.design.pattern.command.command.AlarmStartCommand;
import com.training.design.pattern.command.command.Command;
import com.training.design.pattern.command.command.LampOnCommand;
import com.training.design.pattern.command.component.Alarm;
import com.training.design.pattern.command.component.Button;
import com.training.design.pattern.command.component.Lamp;

/**
 * Command pattern.
 *
 * 실행 될 기능을 캡슐화 함으로써 주어진 여러 기능을 실행할 수 있는 재 사용성이 높은 클래스를 설계하는 패턴.
 * 이벤트가 발생했을 때 실행될 기능이 다양하면서도 변경이 필요한 경우에 이벤트를 발생시키는 클래스를 변경하지 않고 재사용하고자 할 때 유용.
 * */
public class Main {
    public static void main(String[] args) {
        Command lampOnCommand = new LampOnCommand(new Lamp());
        Command alarmStartCommand = new AlarmStartCommand(new Alarm());

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Button button2 = new Button(alarmStartCommand);
        button2.pressed();
        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}
