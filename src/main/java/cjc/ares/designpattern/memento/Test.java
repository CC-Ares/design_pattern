package cjc.ares.designpattern.memento;

/**
 * 备忘录模式
 * 在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
 * 与原型模式的区别，原型模式保存了类的所有状态，备忘录只保存需要的属性
 * 例如游戏存档
 *
 * 缺点是在属性较多的时候会占用较大内存
 */
public class Test {
    public static void main(String[] args) {
        //新建角色
        GameRole gameRole = new GameRole();
        //新建管理员
        CareTaker careTaker = new CareTaker();
        gameRole.init();
        gameRole.show();
        //第一次保存进度
        careTaker.addMemento(gameRole.saveMemento());
        gameRole.fightBoss();
        gameRole.show();
        //第二次保存进度
        careTaker.addMemento(gameRole.saveMemento());
        gameRole.fightBoss();
        gameRole.show();
        //第一次恢复进度
        gameRole.recoverFromMemento(careTaker.getMemento(1));
        gameRole.show();
        //第二次恢复进度
        gameRole.recoverFromMemento(careTaker.getMemento(0));
        gameRole.show();
    }
}
