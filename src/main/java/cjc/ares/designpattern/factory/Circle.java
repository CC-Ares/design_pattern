package cjc.ares.designpattern.factory;

public class Circle implements Shape{

    public Circle(){
        System.out.println("I'm cicle");
    }

    @Override
    public void draw() {
        System.out.println("I'm cicle");
    }
}
