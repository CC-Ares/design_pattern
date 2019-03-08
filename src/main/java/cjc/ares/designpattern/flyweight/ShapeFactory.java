package cjc.ares.designpattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new HashMap<String,Shape>();

    public static Shape getCircle(String color){
        if(circleMap.containsKey(color)){
            return circleMap.get(color);
        }else{
            Shape shape = new Circle(color);
            circleMap.put(color,shape);
            System.out.println("Creating circle of color : " + color);
            return shape;
        }
    }
}
