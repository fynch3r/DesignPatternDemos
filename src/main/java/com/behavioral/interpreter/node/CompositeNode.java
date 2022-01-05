package com.behavioral.interpreter.node;

import com.behavioral.interpreter.AbstractNode;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 19:05
 **/


public class CompositeNode extends AbstractNode {

    private AbstractNode left;
    private AbstractNode right;

    public CompositeNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
