package cjc.ares.designpattern.singleton;

/**
 * 饿汉模式，即在JVM加载时就马上创建单一实例，不管使用与否。
 * 空间换时间，每次调用的时候，不需要判断
 * 线程安全
 */
public class HungerSafeSingleton {

    //Singleton类只有一个构造方法并且是被private修饰的，所以用户无法通过new方法创建该对象实例
    private HungerSafeSingleton(){}

    //在静态初始化器中创建单例实例，这段代码保证了线程安全
    private static HungerSafeSingleton hungerSafeSingleton = new HungerSafeSingleton();

    public static HungerSafeSingleton getInstance(){
        return hungerSafeSingleton;
    }
}
