package cjc.ares.designpattern.visitor;

public abstract class Department {
    public abstract void visit(FullTimeEmployee employee);
    public abstract void visit(PartTimeEmployee employee);

}
