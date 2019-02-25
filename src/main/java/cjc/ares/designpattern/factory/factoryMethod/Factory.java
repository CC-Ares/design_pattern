package cjc.ares.designpattern.factory.factoryMethod;

import cjc.ares.designpattern.factory.Shape;

/**
 * 不再提供一个统一的工厂类来创建所有的对象，而是针对不同的对象提供不同的工厂。也就是说 每个对象都有一个与之对应的工厂
 */
public interface Factory {
    public Shape getShape();
}
