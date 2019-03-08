package cjc.ares.designpattern.command;

/**
 * https://www.cnblogs.com/lzhp/p/3395320.html
 *
 * 命令模式
 * 策略模式和状态模式比较
 * 关注点不同。策略模式关注的是算法替换的问题。 关注的是算法的完整性和封装性。
 * 命令模式关注的是解藕问题，如何让请求者和具体的执行者解耦是它需要解决的。 解耦的要求就是把请求的内容封装为一个一个的命令，由接收者执行。由于封装成了命令，就同时可以对命令进行多种处理。
 * 重要的是使用场景不同。 策略模式适用于算法要求变换的场景，而命令模式适用于解耦两个有紧耦合关系的对象场合或者多命令撤销的场景。
 *
 * https://blog.csdn.net/the_conquer_zzy/article/details/83896050
 */
public class Test {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Light light = new Light();
        FanOffCommand fanOffCommand = new FanOffCommand(fan);
        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        //设置遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.SetCommand(0,fanOnCommand,fanOffCommand);
        remoteController.SetCommand(1,lightOnCommand,lightOffCommand);

        //分别测试遥控器的命令
        remoteController.OnButtonWasPress(0);
        remoteController.OffButtonWasPress(1);
    }
}
