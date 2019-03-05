package cjc.ares.designpattern.dynamicProxy;

/**
 * 茅台酒家卖茅台
 */
public class MaoTai implements WineOwner{
    @Override
    public void sellWine() {
        System.out.println("I sell maotai");
    }
}
