package com.creational.builder.builderimpl;

import com.creational.builder.ActorBuilder;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 11:08
 **/


public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("angel");
    }

    @Override
    public void buildSex() {
        actor.setSex("female");
    }

    @Override
    public void buildFace() {
        actor.setFace("beautiful");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("wings");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("windy");
    }
}
