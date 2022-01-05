package com.behavioral.mediator;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 20:02
 **/


public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();

}
