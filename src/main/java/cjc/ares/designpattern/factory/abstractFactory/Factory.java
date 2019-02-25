package cjc.ares.designpattern.factory.abstractFactory;

/**
 * 抽象工厂模式用来创建一组产品
 */
public interface Factory {
    public Gun produceGun();
    public Bullet produceBullet();
}