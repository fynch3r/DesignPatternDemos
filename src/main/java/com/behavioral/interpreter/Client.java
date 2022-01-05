package com.behavioral.interpreter;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 19:25
 **/


public class Client {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20";

        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);

        String result = handler.output();
        System.out.println(result);

    }
}
