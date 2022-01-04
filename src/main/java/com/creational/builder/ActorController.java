package com.creational.builder;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 11:11
 **/


public class ActorController {
    public Actor construct(ActorBuilder actorBuilder){
        Actor actor;
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairstyle();
        actor = actorBuilder.createActor();
        return actor;
    }
}
