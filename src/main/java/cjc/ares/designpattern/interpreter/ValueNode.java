package cjc.ares.designpattern.interpreter;

/**
 * 非终结表达式
 */
public class ValueNode implements Node{
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
