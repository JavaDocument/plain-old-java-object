package com.gof.behavioral.command.step01;

class RemoteControlTest {

    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl(); // 인보커 (필요한 작업을 요청할 때, 사용할 커맨드 객체를 인자로 전달)
        Light light = new Light(); // 리시버
        LightOnCommand lightOn = new LightOnCommand(light);// 커맨드(리시버)

        remote.setCommand(lightOn); // 커맨드를 인보커에게 전달
        remote.buttonWasPreseed();


    }
}
