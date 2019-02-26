package cjc.ares.designpattern.builder;

public interface PersonBuilder {

    public void buildHead();

    public void buildBody();

    public void buildHand();

    public void buildFoot();

    public Person createPerson();
}
