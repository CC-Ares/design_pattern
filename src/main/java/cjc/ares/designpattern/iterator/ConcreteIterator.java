package cjc.ares.designpattern.iterator;

public class ConcreteIterator implements MyIterator{

    List list = null;
    private int cursor;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public void first() {
        cursor = 0;
    }

    @Override
    public void next() {
        if(cursor<list.getSize()){
            cursor++;
        }
    }

    @Override
    public boolean hasNext() {
        if(cursor<list.getSize()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean isFirst() {
        return cursor==0?true:false;
    }

    @Override
    public boolean isLast() {
        return cursor==(list.getSize()-1)?true:false;
    }

    @Override
    public Object getCurrentObj() {
        return list.get(cursor);//获取当前游标指向的元素
    }
}
