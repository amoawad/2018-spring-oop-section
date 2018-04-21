import commands.Command;
import commands.NoCommand;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    Command[] lastCommands;
    int lastIndex;

    public RemoteControl() {
        onCommands  = new Command[5];
        offCommands = new Command[5];

        lastCommands = new Command[10];

        for(int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        for(int i = 0; i < 10; i++) {
            lastCommands[i] = new NoCommand();
        }
    }

    public void addOnCommands(int index, Command onCommands) {
        this.onCommands[index] = onCommands;
    }

    public void addOffCommands(int index, Command offCommands) {
        this.offCommands[index] = offCommands;
    }

    public void pushON(int index) {
        onCommands[index].execute();
        lastCommands[lastIndex++] = onCommands[index];
    }

    public void pushOFF(int index) {
        offCommands[index].execute();
        lastCommands[lastIndex++] = offCommands[index];
    }

    public void undo() {
        System.out.println("----- UNDO");
        lastCommands[lastIndex-1].undo();
        lastIndex--;
    }


}
