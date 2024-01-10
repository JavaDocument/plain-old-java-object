package com.gof.behavioral.command.step02;

class SetreoOnWithCDCommand implements Command{

    private Stereo stereo;

    public SetreoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
