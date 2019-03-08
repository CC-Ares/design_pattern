package cjc.ares.designpattern.command;

public class FanOffCommand implements ICommand{

    Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.fanOff();
    }
}
