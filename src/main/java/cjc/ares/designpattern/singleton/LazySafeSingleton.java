package cjc.ares.designpattern.singleton;

/**
 * 懒汉模式，线程安全，利用内部类只加载一次机制
 * 将实例保存在内部类中，只有显式调用getInstance时，才会实例化singleton实例，并且只会实例化一次
 */
public class LazySafeSingleton {

    private LazySafeSingleton(){}

    private static class SingletonHolder{
        private static final LazySafeSingleton lazySafeSingleton = new LazySafeSingleton();
    }

    public static final LazySafeSingleton getInstance(){
        return SingletonHolder.lazySafeSingleton;
    }
}
