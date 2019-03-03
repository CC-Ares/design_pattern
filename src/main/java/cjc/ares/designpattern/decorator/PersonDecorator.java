package cjc.ares.designpattern.decorator;

public abstract class PersonDecorator implements Person{

    Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
