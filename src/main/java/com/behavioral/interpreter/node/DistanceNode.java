package com.behavioral.interpreter.node;

import com.behavioral.interpreter.AbstractNode;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 18:59
 **/


public class DistanceNode extends AbstractNode {

    private String distance;

    public DistanceNode(String distance){
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return this.distance;
    }
}
