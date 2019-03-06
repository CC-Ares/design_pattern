package cjc.ares.designpattern.strategy;

/**
 * 在策略模式中，一个类的行为或其算法可以在运行时更改。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。
 * 策略对象改变 context 对象的执行算法。
 */
public class Test {
    public static void main(String[] args) {
        //使用相乘策略
        Context context1 = new Context(new MultipleStrategy());
        //使用相加策略
        Context context2 = new Context(new PlusStrategy());

        context1.executeStrategy(2,3);
        context2.executeStrategy(2,3);
    }

}
