package Behavioral_Patterns.observer_15.no_pattern;

class NewsAgency {
    private String news;

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }

    public void notifySubscribers(NewsChannel channel1, NewsChannel channel2) {
        channel1.update(news);
        channel2.update(news);
    }
}

class NewsChannel {
    private String news;

    public void update(String news) {
        this.news = news;
        System.out.println("News Channel received: " + news);
    }

    public String getNews() {
        return news;
    }
}

public class App {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();

        agency.setNews("Breaking News!");
        agency.notifySubscribers(channel1, channel2);
        // Output:
        // News Channel received: Breaking News!
        // News Channel received: Breaking News!
    }
}
