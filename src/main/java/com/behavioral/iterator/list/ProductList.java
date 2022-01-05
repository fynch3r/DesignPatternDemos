package com.behavioral.iterator.list;

import com.behavioral.iterator.AbstractIterator;
import com.behavioral.iterator.AbstractObjectList;
import com.behavioral.iterator.ProductIterator;

import java.util.List;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 19:40
 **/


public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
