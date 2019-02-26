package cjc.ares.designpattern.builder;

/**
 * 建造者模式的关键，构造的过程封装在此类中，客户端无需知道实例是如何构造的
 * 适用于产品之间差异较小的情况
 */
public class Director {

    PersonBuilder personBuilder;

    public Director(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public Person createPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildHand();
        personBuilder.buildFoot();
        return personBuilder.createPerson();
    }

}
