package com.behavioral.iterator;

import com.behavioral.iterator.list.ProductList;

import java.util.Iterator;
import java.util.List;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 19:41
 **/


public class ProductIterator implements AbstractIterator {

    private List<Object> products;
    private int cursor1; // 记录正向遍历的位置
    private int cursor2; // 记录逆向遍历的位置

    public ProductIterator(ProductList list) {
        this.products = list.getObjects();
        this.cursor1 = 0;
        this.cursor2 = products.size() -1;
    }

    @Override
    public void next() {
        if(cursor1 < products.size()) {
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1 == products.size());
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return (cursor2 == -1);
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
