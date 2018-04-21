package commands;

import java.util.ArrayList;

public class ComboCommand implements Command {

    ArrayList<Command> commands;

    public ComboCommand() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for(Command c : commands) {
            c.execute();
        }
    }

    @Override
    public void undo() {
        for(int i = commands.size()-1; i >= 0  ;i--) {
            commands.get(i).undo();
        }
    }
}
