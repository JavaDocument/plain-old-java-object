package com.gof.behavioral.state;

class TV {

    private PowerState state;

    public TV() {
        this.state = new Off();
    }

    public void pushButton() {
        state = state.pushButton();
    }
}
