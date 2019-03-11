package cjc.ares.designpattern.mediator;

public class Tenant extends Person{

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 将信息交给中介，并告诉他自己是谁，让他去做处理
     * @param message
     */
    public void contact(String message){
        mediator.contact(message,this);
    }

    public void getMessage(String message){
        System.out.println("租房者:" + name +",获得信息：" + message);
    }
}
