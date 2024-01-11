package com.gof.chap03.observer.step03;

class Application {
    public static void main(String[] args) {
        final User user1 = new User("홍길동");
        final User user2 = new User("동길홍");
        final User user3 = new User("길동홍");

        final NewsManager newsManager = new NewsManager();
        News news = new NaverNews();

        news.addContent("첫 번째 기사");
        news.addContent("두 번째 기사");
        news.addContent("세 번째 기사");

        newsManager.registerNews(news);
        newsManager.subscribe(news, user1);
        newsManager.subscribe(news, user2);
        newsManager.subscribe(news, user3);

        newsManager.notifyNews();
    }
}
