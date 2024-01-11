package com.gof.chap03.observer.step03;

import java.util.ArrayList;
import java.util.List;

class NaverNews implements News {
    private final List<String> content = new ArrayList<>();

    public void addContent(String content) {
        this.content.add(content);
    }

    @Override
    public void issue(User user) {
        content.forEach(c ->
                System.out.println(user.getName() + "님 에게 뉴스를 전송. 내용: " + c));
    }
}
