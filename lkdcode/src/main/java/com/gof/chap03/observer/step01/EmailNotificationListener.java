package com.gof.chap03.observer.step01;

import java.io.File;

// 알림 수신 시 이메일 전송
class EmailNotificationListener implements EventListener {
    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to" + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
