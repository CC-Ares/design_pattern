package cjc.ares.designpattern.factory.factoryMethod;

import cjc.ares.designpattern.factory.Circle;
import cjc.ares.designpattern.factory.Shape;

public class CircleFactory implements Factory{
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
