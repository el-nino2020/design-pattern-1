package Command.command;

import java.util.ArrayDeque;

/**
 * 宏命令——批处理命令
 */
public class MacroCommand implements Command {
    private ArrayDeque<Command> commands = new ArrayDeque<>();

    public void append(Command command) {
        if (command != this) {
            commands.addLast(command);
        }
    }

    public void undo() {
        if (!commands.isEmpty())
            commands.pollLast();
    }

    public void clear() {
        commands.clear();
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
