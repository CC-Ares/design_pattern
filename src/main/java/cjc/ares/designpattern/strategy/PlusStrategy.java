package cjc.ares.designpattern.strategy;

/**
 * 相加策略
 */
public class PlusStrategy implements Algorithm{
    @Override
    public int caculate(int a, int b) {
        return a+b;
    }
}
