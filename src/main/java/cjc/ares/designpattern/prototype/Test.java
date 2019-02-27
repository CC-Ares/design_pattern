package cjc.ares.designpattern.prototype;

public class Test {
    public static void main(String[] args) {
        UnderlinePen underlinePen = new UnderlinePen('-');
        MessageBox messageBox = new MessageBox('*');
        Manager manager = new Manager();
        manager.register("underLine",underlinePen);
        manager.register("messageBox",messageBox);

        Product product = manager.create("underLine");
        Product product1 = manager.create("messageBox");
        product.use("Hello World");
        product1.use("Hello World");
    }

}
