package commands;

import sets.TV;

public class TVOnCommand implements Command {

    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnON();
    }

    @Override
    public void undo() {
        tv.turnOFF();
    }
}
