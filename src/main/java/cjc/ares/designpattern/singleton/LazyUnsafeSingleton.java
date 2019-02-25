package cjc.ares.designpattern.singleton;

/**
 * 懒汉模式，即在使用的时候才判断是否存在实例，并且返回实例
 * 线程不安全，多线程竞争时会多创建实例
 */
public class LazyUnsafeSingleton {

    private LazyUnsafeSingleton(){}

    private static LazyUnsafeSingleton lazyUnsafeSingleton;

    //此方法没有加锁，线程不安全
    public static LazyUnsafeSingleton getInstance(){
        //判断当前实例是否已存在，存在即返回，否则新建实例
        if(lazyUnsafeSingleton == null){
            lazyUnsafeSingleton = new LazyUnsafeSingleton();
        }
        return lazyUnsafeSingleton;
    }
}
