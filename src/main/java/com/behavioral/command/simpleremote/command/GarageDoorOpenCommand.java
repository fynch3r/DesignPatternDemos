package com.behavioral.command.simpleremote.command;

import com.behavioral.command.simpleremote.Command;
import com.behavioral.command.simpleremote.entity.GarageDoor;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2021-12-01 19:44
 **/



public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
