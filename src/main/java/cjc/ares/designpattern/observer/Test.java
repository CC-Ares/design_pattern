package cjc.ares.designpattern.observer;

public class Test {
    public static void main(String[] args) {
        WeChatSubscription weChatSubscription = new WeChatSubscription();
        Observer user1 = new User("Ares");
        Observer user2 = new User("Shawn Yue");
        weChatSubscription.registerObserver(user1);
        weChatSubscription.registerObserver(user2);
        weChatSubscription.setInformation("good night");
    }
}
