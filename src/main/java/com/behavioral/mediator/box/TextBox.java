package com.behavioral.mediator.box;

import com.behavioral.mediator.Component;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 20:08
 **/


public class TextBox extends Component {
    @Override
    public void update() {
        System.out.println("客户信息增加后文本框清空");
    }

    public void setText() {
        System.out.println("文本框显示");
    }
}
