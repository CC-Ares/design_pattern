package cjc.ares.designpattern.mediator;

/**
 * 中介者模式
 * 通过中介者模式，我们可以将复杂关系的网状结构变成结构简单的以中介者为核心的星形结构，每个对象不再和它与之关联的对象直接发生相互作用，而是通过中介者对象来另一个对象发生相互作用。
 *
 * 优点：
 *
 * 简化了对象之间的关系，将系统的各个对象之间的相互关系进行封装，将各个同事类解耦，使得系统变为松耦合。
 * 提供系统的灵活性，使得各个同事对象独立而易于复用。
 * 缺点：
 *
 * 中介者模式中，中介者角色承担了较多的责任，所以一旦这个中介者对象出现了问题，整个系统将会受到重大的影响。
 * 新增加一个同事类时，不得不去修改抽象中介者类和具体中介者类，此时可以使用观察者模式和状态模式来解决这个问题。
 */
public class Test {
    public static void main(String[] args) {
        HouseMediator mediator = new HouseMediator();
        HouseOwner houseOwner = new HouseOwner("包租婆",mediator);
        Tenant tenant = new Tenant("租户",mediator);
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);
        tenant.contact("听说你那里有三室的房主出租.....");
        houseOwner.contact("是的!请问你需要租吗?");
    }
}
