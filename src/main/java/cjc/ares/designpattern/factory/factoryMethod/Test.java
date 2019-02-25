package cjc.ares.designpattern.factory.factoryMethod;

import cjc.ares.designpattern.factory.Shape;

public class Test {
    public static void main(String[] args) {
        Factory circlefactory = new CircleFactory();
        Shape circle = circlefactory.getShape();
        circle.draw();
    }
}
