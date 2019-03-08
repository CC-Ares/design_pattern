package cjc.ares.designpattern.command;

public class RemoteController {
    private ICommand[] onCommands = new ICommand[2];
    private ICommand[] offCommands = new ICommand[2];

    public void SetCommand(int slot, ICommand onCommand, ICommand offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void OnButtonWasPress(int slot){
        onCommands[slot].execute();
    }
    public void OffButtonWasPress(int slot){
        offCommands[slot].execute();
    }
}
