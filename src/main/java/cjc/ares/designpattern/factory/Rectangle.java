package cjc.ares.designpattern.factory;

public class Rectangle implements Shape{

    public Rectangle(){
        System.out.println("I'm Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("I'm Rectangle");
    }
}
