package cjc.ares.designpattern.interpreter;

/**
 * 优点
 * 1、 可扩展性比较好，灵活。
 *
 * 2、 增加了新的解释表达式的方式。
 *
 * 3、 易于实现文法。
 *
 * 缺点
 * 1、 执行效率比较低，可利用场景比较少。
 *
 * 2、 对于复杂的文法比较难维护
 */
public class Test{
    public static void main(String args[]){
        String statement = "3 * 2 * 4 / 6 % 5";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}