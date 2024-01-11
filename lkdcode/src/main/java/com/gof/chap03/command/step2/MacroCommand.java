package com.gof.chap03.command.step2;

import java.util.ArrayDeque;
import java.util.Deque;

class MacroCommand implements Command {
    private final Deque<Command> commands = new ArrayDeque<>();

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    public void append(Command command) {
        if (command == this) throw new IllegalArgumentException("infinite loop caused by append");
        this.commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) this.commands.pop();
    }

    public void clear() {
        this.commands.clear();
    }
}
