package com.behavioral.command.simpleremote;

import com.behavioral.command.simpleremote.entity.GarageDoor;
import com.behavioral.command.simpleremote.entity.Light;
import com.behavioral.command.simpleremote.impl.GarageDoorOpenCommand;
import com.behavioral.command.simpleremote.impl.LightOnCommand;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 19:46
 **/


public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);

        // 遥控器
        SimpleRemoteControl remote = new SimpleRemoteControl();

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
