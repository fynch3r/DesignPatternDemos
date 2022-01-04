package com.creational.builder;

import com.creational.builder.builderimpl.AngelBuilder;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 11:15
 **/


public class Client {
    public static void main(String[] args) {
        AngelBuilder angelBuilder = new AngelBuilder();
        ActorController actorController = new ActorController();
        Actor angel = actorController.construct(angelBuilder);

        System.out.println(angel.getType());
        System.out.println(angel.getSex());
        System.out.println(angel.getFace());
        System.out.println(angel.getCostume());
        System.out.println(angel.getHairstyle());
    }
}
