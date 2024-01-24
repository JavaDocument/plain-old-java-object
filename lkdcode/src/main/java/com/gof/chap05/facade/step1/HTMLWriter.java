package com.gof.chap05.facade.step1;

class HTMLWriter {
    public HTMLWriter() {
    }

    public void title(String title) {
        System.out.println(title + " 페이지 출력!");
    }

    public void paragraph(String paragraph) {
        System.out.println(paragraph + " 단락 출력!");
    }

    public void link(String link) {
        System.out.println(link + " 링크 출력!");
    }

    public void mailto(String mailto) {
        System.out.println(mailto + " 이메일 출력!");
    }

    public void close() {
        System.out.println("HTML 닫기");
    }
}
