package com.gof.chap03.command.step1;

import java.util.Stack;

class CommandHistory {
    private final Stack<Command> history = new Stack<>();

    public void push(Command command) {
        this.history.push(command);
    }

    public Command pop() {
        return this.history.pop();
    }

    public boolean isEmpty() {
        return this.history.isEmpty();
    }
}
