package cjc.ares.designpattern.iterator;

/**
 * 迭代器模式
 * 提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示
 * 比如有几个类，一个类中有集合，一个类中有数组，一个类中有set，采用迭代器模式则可以对这3者进行封装，全都提供一个迭代器，而不需要将他们从类中取出来，再分别进行迭代
 * 用户只需要得到迭代器就可以进行迭代，不需要关注迭代器里的算法
 */
public class Test {
    public static void main(String[] args) {
        List list = new ConcreteList(3);
        list.add("a");
        list.add("b");
        list.add("c");
        MyIterator myIterator = list.iterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.getCurrentObj());
            myIterator.next();
        }
    }
}

