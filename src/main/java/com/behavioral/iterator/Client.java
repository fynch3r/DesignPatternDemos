package com.behavioral.iterator;

import com.behavioral.iterator.list.ProductList;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 19:48
 **/


public class Client {
    public static void main(String[] args) {
        AbstractObjectList list;
        AbstractIterator iterator;

        List<Object> products = new ArrayList<>();
        products.add("a");
        products.add("b");
        products.add("c");
        products.add("d");
        products.add("e");

        list = new ProductList(products);
        iterator = list.createIterator();

        System.out.println("正向遍历：");
        while(!iterator.isLast()) {
            System.out.println(iterator.getNextItem());
            iterator.next();// 光标后移
        }
        System.out.println("逆向遍历：");
        while(!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem());
            iterator.previous();// 光标前移
        }





    }
}
