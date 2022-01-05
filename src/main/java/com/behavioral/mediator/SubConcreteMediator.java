package com.behavioral.mediator;

import com.behavioral.mediator.element.Label;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 20:16
 **/


public class SubConcreteMediator extends ConcreteMediator{
    public Label label;

    @Override
    public void componentChanged(Component c) {
        if (c == addButton) {
            System.out.println("--点击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
            label.update();
        } else if (c == list) {
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        } else if (c == cb) {
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }

}
