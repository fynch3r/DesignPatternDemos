package com.behavioral.mediator.element;

import com.behavioral.mediator.Component;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 20:04
 **/


public class List extends Component {

    @Override
    public void update() {
        System.out.println("列表增加一项");
    }

    public void select(){
        System.out.println("列表框选中一项");
    }




}
