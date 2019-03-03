package cjc.ares.designpattern.facade;

/**
 * 外观模式，即把所有子系统的实现全部隐藏起来，只对外提供一个总的接口
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer(new CPU(),new Disk());
        computer.start();
        computer.shutDown();
    }
}
