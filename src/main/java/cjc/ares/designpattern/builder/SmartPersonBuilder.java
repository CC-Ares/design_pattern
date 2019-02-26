package cjc.ares.designpattern.builder;

/**
 * 建造人的建造器，如果需要其他种类的人，创建其他建造器即可，无需修改原代码，符合开闭原则
 */
public class SmartPersonBuilder implements PersonBuilder{

    Person person;

    public SmartPersonBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("智商250");
    }

    @Override
    public void buildBody() {
        person.setBody("一米八");
    }

    @Override
    public void buildHand() {
        person.setHand("长手");
    }

    @Override
    public void buildFoot() {
        person.setFoot("长脚");
    }

    @Override
    public Person createPerson() {
        return person;
    }
}
