package com.gof.chap03.observer.step01;

import java.io.File;

// 공통 옵저버 인터페이스
interface EventListener {
    void update(String eventType, File file);
}
