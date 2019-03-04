package cjc.ares.designpattern.observer;

/**
 * 定义被观察者接口
 */
public interface Observerable {
    public void registerObserver(Observer observer);
    public void removerObserver(Observer observer);
    public void notifyAllObserver();

}
