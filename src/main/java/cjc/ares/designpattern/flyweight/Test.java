package cjc.ares.designpattern.flyweight;

/**
 * 享元模式
 * 享元模式与单例模式的区别在于享元模式是对象级别的，可以有存在多个对象，而单例模式只能存在一个对象
 * 譬如本例中，多种颜色能得到多个对象，但是相同颜色获得的对象都是一样的，节省了内存空间，而如果是单例模式，则所有的颜色获取到的对象都必须是同一个
 */
public class Test {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
