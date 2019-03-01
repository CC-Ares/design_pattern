package cjc.ares.designpattern.bridge;

public class Blue implements Color{

    @Override
    public void paint(String shape) {
        System.out.println("蓝色的"+shape);
    }
}
