package cjc.ares.designpattern.dynamicProxy;

import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Proxy;

/**
 * 动态代理不用为每个类（接口）都创建一个代理对象，而可以通过反射，在运行时动态的创建出代理类
 */
public class Test {
    public static void main(String[] args) {

        MaoTai maoTai = new MaoTai();
        SellProxyHandler sellWineProxyHandler = new SellProxyHandler(maoTai);
        //酒类代理类
        WineOwner wineProxy = (WineOwner) Proxy.newProxyInstance(maoTai.getClass().getClassLoader(),maoTai.getClass().getInterfaces(),sellWineProxyHandler);
        wineProxy.sellWine();

        Zhonghua zhonghua = new Zhonghua();
        SellProxyHandler sellCigaretteProxyHandler = new SellProxyHandler(zhonghua);
        //香烟代理类
        CigaretteOwner cigaretteProxy = (CigaretteOwner) Proxy.newProxyInstance(zhonghua.getClass().getClassLoader(),zhonghua.getClass().getInterfaces(),sellCigaretteProxyHandler);
        cigaretteProxy.sellCigarette();

    }
}
