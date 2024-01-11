package com.gof.chap03.command.step3.step3_4;

class Application {
    public static void main(String[] args) {
        // Command
        final Alarm alarm = new Alarm();
        final Lamp lamp = new Lamp();
        final Remote remote = new Remote();
        final Keyboard keyboard = new Keyboard();
        final Calculator calculator = new Calculator();

        // Button
        final Button button = new Button();

        // 실행 관리 매니저
        final ButtonManager buttonManager = new ButtonManager(button);

        buttonManager.appendCommand(alarm);
        buttonManager.appendCommand(lamp);
        buttonManager.appendCommand(remote);
        buttonManager.appendCommand(keyboard);
        buttonManager.appendCommand(calculator);

        buttonManager.execute(); // 알람 -> 램프 -> 리모콘 -> 키보드 -> 계산기
        buttonManager.execute(); // 한 번 사용한 기능들은 재실행되지 않는다.

        System.out.println("----------------------------------------------");

        // 기능 재 추가
        buttonManager.appendCommand(calculator);
        buttonManager.appendCommand(lamp);
        buttonManager.appendCommand(remote);

        // buttonManager.execute(); 지금 실행하게 되면 계산기->램프->리모콘 순서로 실행.
        buttonManager.undoCommand(); // undo 로 remote 명령 제거!
        buttonManager.execute(); // 실행하게 되면 계산기->램프 실행.
    }
}
