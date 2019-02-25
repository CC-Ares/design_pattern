package cjc.ares.designpattern.singleton;

/**
 * 懒汉模式，线程安全，双重加锁版
 */
public class LazySafeDoubleCheckSingleton {

    private LazySafeDoubleCheckSingleton(){}

    //volatile保证，当lazySafeDoubleCheckSingleton变量被初始化成Singleton实例时，多个线程可以正确处理lazySafeDoubleCheckSingleton变量
    private volatile static LazySafeDoubleCheckSingleton lazySafeDoubleCheckSingleton;

    public static LazySafeDoubleCheckSingleton getInstance(){
        //检查实例，如果不存在才进入同步代码块
        if(lazySafeDoubleCheckSingleton == null){
            //只有第一次才执行此代码
            synchronized (LazySafeDoubleCheckSingleton.class){
                //加锁后再此判断实例是否存在，不存在才创建
                if(lazySafeDoubleCheckSingleton == null){
                    lazySafeDoubleCheckSingleton = new LazySafeDoubleCheckSingleton();
                }
            }
        }
        return lazySafeDoubleCheckSingleton;
    }
}
