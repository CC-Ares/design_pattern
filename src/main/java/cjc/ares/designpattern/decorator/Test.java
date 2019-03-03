package cjc.ares.designpattern.decorator;

public class Test {
    public static void main(String[] args) {
        Person person = new AresDecorator(new Ares());
        person.eat();
    }
}
