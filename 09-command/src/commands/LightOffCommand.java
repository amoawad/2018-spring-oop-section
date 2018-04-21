package commands;

import sets.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOFF();
    }

    @Override
    public void undo() {
        this.light.switchON();
    }
}
