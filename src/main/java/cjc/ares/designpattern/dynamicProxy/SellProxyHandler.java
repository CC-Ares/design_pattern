package cjc.ares.designpattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SellProxyHandler implements InvocationHandler {
    Object sellOwner;

    public SellProxyHandler(Object sellOwner) {
        this.sellOwner = sellOwner;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I am sell proxy , i can proxy anything");
        method.invoke(sellOwner,args);
        System.out.println("proxy end");
        return null;
    }
}
