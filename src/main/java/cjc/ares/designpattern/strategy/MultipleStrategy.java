package cjc.ares.designpattern.strategy;

/**
 * 相乘策略
 */
public class MultipleStrategy implements Algorithm{
    @Override
    public int caculate(int a, int b) {
        return a*b;
    }
}
