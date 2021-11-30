package com.factory;

import com.factory.impl.Circle;
import com.factory.impl.Rectangle;
import com.factory.impl.Square;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 16:43
 **/


public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if("Rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
