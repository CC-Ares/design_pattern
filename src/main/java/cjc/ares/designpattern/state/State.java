package cjc.ares.designpattern.state;

/**
 * 状态接口类，定义了状态有哪些公有方法
 */
public interface State {
    public void insertCoin();
    public void returnCoin();
    public void turnCrank();
    public void dispense();
    public void printState();
}
