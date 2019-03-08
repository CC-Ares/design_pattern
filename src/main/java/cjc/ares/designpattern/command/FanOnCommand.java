package cjc.ares.designpattern.command;

public class FanOnCommand implements ICommand{

    Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.fanOn();
    }
}
