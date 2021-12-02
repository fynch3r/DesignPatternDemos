package com.command.simpleremote.impl;

import com.command.simpleremote.Command;
import com.command.simpleremote.*;
import com.command.simpleremote.entity.Light;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
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
