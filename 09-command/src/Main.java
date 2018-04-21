import commands.*;
import sets.Light;
import sets.Stereo;
import sets.TV;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();
        TV tv = new TV();
        Stereo stereo = new Stereo();

        RemoteControl rc = new RemoteControl();

        ComboCommand party = new ComboCommand();
        party.addCommand(new LightOnCommand(light));
        party.addCommand(new TVOnCommand(tv));
        party.addCommand(new StereoOnCommand(stereo));
        party.addCommand(new LightOffCommand(light));

        rc.addOnCommands(0, party);

        rc.pushON(0);

        rc.undo();

        rc.pushON(1);
    }



}
