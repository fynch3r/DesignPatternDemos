package com.command.simpleremote;

/**
 * @program: DesignPattern
 * @description: 简易遥控器
 * @author: 0range
 * @create: 2021-12-01 19:45
 **/


public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}


    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
