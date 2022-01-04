package com.creational.builder.builderimpl;

import com.creational.builder.ActorBuilder;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 11:04
 **/


public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("male");
    }

    @Override
    public void buildFace() {
        actor.setFace("handsome");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("armor");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("smooth");
    }
}
