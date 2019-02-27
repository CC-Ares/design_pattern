package cjc.ares.designpattern.adapter;

public class TypeCLine implements Target{
    @Override
    public void connect() {
        System.out.println("connect by Type-c");
    }
}
