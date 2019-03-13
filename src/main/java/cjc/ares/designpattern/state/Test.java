package cjc.ares.designpattern.state;

/**
 * 状态模式
 * 状态模式允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
 *
 * 客户不会和状态进行交互,全盘了解状态是 context的工作
 * 在状态模式中，每个状态通过持有Context的引用，来实现状态转移
 * 使用状态模式总是会增加设计中类的数目，这是为了要获得程序可扩展性，弹性的代价，如果你的代码不是一次性的，后期可能会不断加入不同的状态，那么状态模式的设计是绝对值得的。
 * 状态类可以被多个context实例共享
 *
 * 与策略模式对比
 * 状态模式可以反过来改变context类，使其状态改变，因此行为改变
 * 而策略模式不会改变context类，只是改变了该对象行为
 */
public class Test {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(6);

        candyMachine.printState();

        candyMachine.insertCoin();
        candyMachine.printState();

        candyMachine.turnCrank();

        candyMachine.printState();

        candyMachine.insertCoin();
        candyMachine.printState();

        candyMachine.turnCrank();

        candyMachine.printState();
    }
}
