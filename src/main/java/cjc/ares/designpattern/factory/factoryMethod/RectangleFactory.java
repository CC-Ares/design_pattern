package cjc.ares.designpattern.factory.factoryMethod;

import cjc.ares.designpattern.factory.Rectangle;
import cjc.ares.designpattern.factory.Shape;

public class RectangleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
