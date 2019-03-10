package cjc.ares.designpattern.iterator;

/**
 * 定义集合可以进行的操作
 */
public interface List {
    public void add(Object obj);
      public Object get(int index);
      public MyIterator iterator();
      public int getSize();
}
