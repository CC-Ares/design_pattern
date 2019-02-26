package cjc.ares.designpattern.builder;

public class Test {
    public static void main(String[] args) {
        SmartPersonBuilder smartPersonBuilder = new SmartPersonBuilder();
        //关键在于之后要生成其他类型的产品，只需要再创建builder类就好，无需修改原代码
        Director director = new Director(smartPersonBuilder);
        Person person = director.createPerson();
    }
}
