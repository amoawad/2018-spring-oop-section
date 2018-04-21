package commands;

import sets.TV;

public class TVOffCommand implements Command {

    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOFF();
    }

    @Override
    public void undo() {
        tv.turnON();
    }
}
