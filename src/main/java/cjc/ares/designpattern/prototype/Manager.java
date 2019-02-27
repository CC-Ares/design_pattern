package cjc.ares.designpattern.prototype;

import java.util.HashMap;

/**
 * 原型模式就是实例化一个manger管理对象，把要复制的实例都存放再manager的map中，要使用的时候从map中获取，而获取的是该实例克隆出来的对象
 */
public class Manager {
    //保存实例的“名字”和“实例”之间的对应关系
    private HashMap<String,Product> showCase = new HashMap<String,Product>();

    //register方法将接收到的一组“名字”和“Product接口”注册到showcase中。这里Product是实现Product接口的实例，具体还未确定
    public void register(String name,Product product){
        showCase.put(name,product);
    }

    public Product create(String name){
        Product product = showCase.get(name);
        return product.create();
    }
}
