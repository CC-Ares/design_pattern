package cjc.ares.designpattern.iterator;

public class ConcreteList implements List{

    private Object[] list;
    private int index = 0;

    public ConcreteList(int i) {
        this.list = new Object[i];
    }

    @Override
    public void add(Object obj) {
        list[index] = obj;
        index++;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public MyIterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return list.length;
    }
}
