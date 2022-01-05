package com.behavioral.strategy.movie.discount;

import com.behavioral.strategy.movie.Discount;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-05 09:35
 **/


public class ChildrenDiscount implements Discount {

    private final double DISCOUNT =10;

    @Override
    public double calculate(double price) {
        if(price>=20) {
            return price - DISCOUNT;
        }
        else {
            return price;
        }
    }
}
