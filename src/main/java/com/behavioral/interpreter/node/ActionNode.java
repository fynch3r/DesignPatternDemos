package com.behavioral.interpreter.node;

import com.behavioral.interpreter.AbstractNode;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 19:01
 **/


public class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if ("move".equalsIgnoreCase(action)) {
            return "移动";
        }
        else if ("run".equalsIgnoreCase(action)) {
            return "快速移动";
        }
        else {
            return "无效指令";
        }
    }
}
