package cjc.ares.designpattern.visitor;

public interface IEmployee {
    public void accept(Department handler);
}
