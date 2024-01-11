package com.gof.chap03.command.step3.step3_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class ButtonManager {
    private final Deque<Command> commands = new ArrayDeque<>();
    private final Button button;

    public ButtonManager(Button button) {
        this.button = button;
    }

    public void appendCommand(Command command) {
        this.commands.offerLast(command);
    }

    public void undoCommand() {
        if (!this.commands.isEmpty()) this.commands.pollLast();
    }

    public void clear() {
        this.commands.clear();
    }

    public void execute() {
        while (!this.commands.isEmpty()) {
            final Command command = this.commands.pollFirst();
            this.button.press(command);
        }
    }
}
