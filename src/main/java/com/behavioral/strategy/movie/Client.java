package com.behavioral.strategy.movie;

import com.behavioral.strategy.movie.discount.StudentDiscount;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-05 09:45
 **/


public class Client {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        double originPrice = 100.0;
        double currrentPrice;

        // 影票设置为原价
        ticket.setPrice(originPrice);
        System.out.println("Before discount: " + originPrice);

        // 学生价
        Discount discount;
        discount = new StudentDiscount();
        ticket.setDiscount(discount);

        // 折后价
        currrentPrice = ticket.getPrice();
        System.out.println("After discount: " + currrentPrice);

    }
}
