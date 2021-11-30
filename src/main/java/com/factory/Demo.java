package com.factory;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 16:50
 **/


public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.banner();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.banner();
        Shape square = shapeFactory.getShape("SQUARE");
        square.banner();
    }
}
