package com.gof.chap03.observer.step03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class NewsManager {
    private final Map<News, List<User>> map = new HashMap<>();

    public void registerNews(News news) {
        this.map.put(news, new ArrayList<>());
    }

    public void removeNews(News news) {
        this.map.remove(news);
    }

    public void subscribe(News news, User user) {
        final List<User> users = map.get(news);
        users.add(user);
    }

    public void notifyNews() {
        this.map.forEach((news, users) -> users.forEach(news::issue));
    }
}
