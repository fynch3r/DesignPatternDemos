package com.behavioral.mediator.element;

import com.behavioral.mediator.Component;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 20:06
 **/


public class Label extends Component {
    @Override
    public void update() {
        System.out.println("文本标签内容改变，客户信息总数加一");
    }
}
