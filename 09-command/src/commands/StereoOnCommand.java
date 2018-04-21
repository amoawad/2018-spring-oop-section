package commands;

import sets.Stereo;

public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.powerON();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
        stereo.powerOFF();
    }
}
