package cjc.ares.designpattern.bridge;

public class Square extends Shape{
    @Override
    public void draw() {
        getColor().paint("正方形");
    }
}
