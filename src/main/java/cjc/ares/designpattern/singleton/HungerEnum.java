package cjc.ares.designpattern.singleton;

public enum  HungerEnum {
    //定义一个枚举的元素，它就是 Singleton 的一个实例
    INSTANCE;

    public void doSomething(){
        System.out.println("枚举方法实现");
    }
}

/**
 * 使用方式
 */
//public class Test{
//    public static void main(String[] args) {
//        HungerEnum singleton = HungerEnum.INSTANCE;
//        singleton.doSomething();//output:枚举方法实现单例
//
//    }
//}

