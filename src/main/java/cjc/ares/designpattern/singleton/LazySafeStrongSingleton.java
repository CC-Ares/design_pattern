package cjc.ares.designpattern.singleton;

/**
 * 懒汉模式线程安全，但是synchronized是重量级锁，每次获取实例都加锁影响性能
 * 可以用双重加锁进行优化
 */
public class LazySafeStrongSingleton {

    private LazySafeStrongSingleton(){}

    private static LazySafeStrongSingleton lazySafeStrongSingleton;

    //此处加锁保证线程安全
    public static synchronized LazySafeStrongSingleton getInstance(){
        if(lazySafeStrongSingleton == null){
            lazySafeStrongSingleton = new LazySafeStrongSingleton();
        }
        return lazySafeStrongSingleton;
    }
}
