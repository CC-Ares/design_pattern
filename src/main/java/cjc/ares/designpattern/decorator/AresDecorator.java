package cjc.ares.designpattern.decorator;

/**
 * 适配器模式
 * 适配器模式是在适配器中，重写旧接口的方法来调用新接口方法，来实现旧接口不改变，同时使用新接口的目的。新接口适配旧接口。
 * 而装饰模式，是装饰器和旧接口实现相同的接口，在调用新接口的方法中，会调用旧接口的方法，并对其进行扩展。
 *
 *
 * 适配器模式和装饰模式的区别主要在：适配器模式适配的是原本不支持的功能，即没有实现接口的功能
 * 而装饰器模式是在原本已实现接口功能的情况下，对功能进行扩展
 */
public class AresDecorator extends PersonDecorator{
    public AresDecorator(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("decorator help you");
    }
}
