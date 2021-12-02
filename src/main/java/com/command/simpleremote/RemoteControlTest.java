package com.command.simpleremote;

import com.command.simpleremote.entity.GarageDoor;
import com.command.simpleremote.entity.Light;
import com.command.simpleremote.impl.GarageDoorOpenCommand;
import com.command.simpleremote.impl.LightOnCommand;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 19:46
 **/


public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
