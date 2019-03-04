package cjc.ares.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号，实现被观察者接口
 */
public class WeChatSubscription implements Observerable{
    List<Observer> observerList;
    String message;

    public WeChatSubscription() {
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    @Override
    public void removerObserver(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for(Observer observer:observerList){
            observer.update(message);
        }
    }

    public void setInformation(String message){
        System.out.println(message);
        this.message = message;
        notifyAllObserver();
    }
}
