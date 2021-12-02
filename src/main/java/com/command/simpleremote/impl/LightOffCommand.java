package com.command.simpleremote.impl;

import com.command.simpleremote.Command;
import com.command.simpleremote.entity.Light;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 19:43
 **/


public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}