package cjc.ares.designpattern.factory.simpleFactory;

import cjc.ares.designpattern.factory.Shape;
import cjc.ares.designpattern.factory.simpleFactory.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        Shape shape = SimpleFactory.getShape("Circle");
        shape.draw();
        Shape shape1 = SimpleFactory.getShape("Rectangle");
        shape1.draw();
    }

}
