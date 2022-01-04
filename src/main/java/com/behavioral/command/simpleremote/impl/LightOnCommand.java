package com.behavioral.command.simpleremote.impl;

import com.behavioral.command.simpleremote.Command;
import com.behavioral.command.simpleremote.entity.Light;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2021-12-01 19:25
 **/


public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
