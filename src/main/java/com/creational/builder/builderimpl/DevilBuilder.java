package com.creational.builder.builderimpl;

import com.creational.builder.Actor;
import com.creational.builder.ActorBuilder;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 11:06
 **/


public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("demon");
    }

    @Override
    public void buildSex() {
        actor.setSex("devil");
    }

    @Override
    public void buildFace() {
        actor.setFace("ugly");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("blackcoat");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("bald");
    }
}
