package cjc.ares.designpattern.observer;

/**
 * 微信用户
 */
public class User implements Observer{
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " accepted message " + message);
    }
}
