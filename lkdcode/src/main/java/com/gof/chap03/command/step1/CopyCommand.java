package com.gof.chap03.command.step1;

 class CopyCommand extends Command{
     public CopyCommand(Editor editor) {
         super(editor);
     }

     @Override
     public boolean execute() {
         editor.clipboard = editor.textField.getSelectedText();
         return false;
     }
 }
