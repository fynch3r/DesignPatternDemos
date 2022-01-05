package com.behavioral.command.simpleremote;

import com.behavioral.command.simpleremote.entity.GarageDoor;
import com.behavioral.command.simpleremote.entity.Light;
import com.behavioral.command.simpleremote.command.GarageDoorOpenCommand;
import com.behavioral.command.simpleremote.command.LightOnCommand;


public class RemoteControlTest {
    public static void main(String[] args) {

        // 遥控器
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();


        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
