package com.gof.chap03.command.step1;

abstract class Command {
    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    void backup(){
        backup = editor.textField.getText();
    }

    public void undo(){
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
