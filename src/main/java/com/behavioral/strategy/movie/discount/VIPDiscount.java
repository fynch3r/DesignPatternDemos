package com.behavioral.strategy.movie.discount;

import com.behavioral.strategy.movie.Discount;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-05 09:36
 **/


public class VIPDiscount implements Discount {

    private final double DISCOUNT = 0.5;

    @Override
    public double calculate(double price) {
        return price * DISCOUNT;
    }
}
