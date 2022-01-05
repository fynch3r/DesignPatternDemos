package com.behavioral.mediator.box;

import com.behavioral.mediator.Component;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 20:10
 **/


public class ComboBox extends Component {
    @Override
    public void update() {
        System.out.println("组合框增加一项");
    }
    public void select(){
        System.out.println("组合框选中一项");
    }
}
