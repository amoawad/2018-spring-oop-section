package commands;

import sets.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchON();
    }

    @Override
    public void undo() {
        light.switchOFF();
    }
}
