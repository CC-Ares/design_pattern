package cjc.ares.designpattern.factory.simpleFactory;

import cjc.ares.designpattern.factory.Circle;
import cjc.ares.designpattern.factory.Rectangle;
import cjc.ares.designpattern.factory.Shape;

/**
 * 简单共产模式，严格意义上不算设计模式，只是把新建对象的操作全部放在工厂类中
 * 当添加对象时，要修改工厂类，违背开放-封闭原则
 */
public class SimpleFactory {
    public static Shape getShape(String shape){
        switch (shape){
            case "Circle":return new Circle();
            case "Rectangle":return new Rectangle();
            default:return null;
        }
    }
}
