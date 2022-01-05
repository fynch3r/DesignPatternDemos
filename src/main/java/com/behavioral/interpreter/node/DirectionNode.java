package com.behavioral.interpreter.node;

import com.behavioral.interpreter.AbstractNode;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 18:57
 **/


public class DirectionNode extends AbstractNode {

    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if ("up".equalsIgnoreCase(direction)) {
            return "向上";
        }
        else if ("down".equalsIgnoreCase(direction)) {
            return "向下";
        }
        else if ("left".equalsIgnoreCase(direction)) {
            return "向左";
        }
        else if ("right".equalsIgnoreCase(direction)) {
            return "向右";
        }
        else {
            return "无效指令";
        }
    }
}
