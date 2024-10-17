package Behavioral_Patterns.observer_15.using_pattern;
import java.util.ArrayList;
import java.util.List;

// Subject
class NewsAgency {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}

// Observer interface
interface Observer {
    void update(String news);
}

// Concrete Observer
class NewsChannel implements Observer {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("News Channel received: " + news);
    }

    public String getNews() {
        return news;
    }
}

// Client
public class App {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setNews("Breaking News!");
        // Output:
        // News Channel received: Breaking News!
        // News Channel received: Breaking News!
    }
}

