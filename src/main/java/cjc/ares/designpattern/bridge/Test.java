package cjc.ares.designpattern.bridge;

/**
 * 桥接模式把抽象和实现分离出来
 * 如果不使用桥接模式，使用继承的方式会增加系统的耦合度
 * 颜色和形状可以自由搭配，而不需要为所有的组合方式创建类
 * 使用的是组合思想
 */
public class Test {
    public static void main(String[] args) {
        Color color = new White();
        Shape shape = new Square();
        shape.setColor(color);
        shape.draw();
    }
}
