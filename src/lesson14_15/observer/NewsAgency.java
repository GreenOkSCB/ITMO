package lesson14_15.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Listener> listeners = new ArrayList<>();

    public void subscribe(Listener listener){
        listeners.add(listener);
    }

    public void unsubscribe(Listener listener){
        listeners.remove(listener);
    }

    public void newMessage(String mess){
        System.out.println("Сообщение: " + mess);
        notifyListeners(mess);
    }

    private void notifyListeners(String mess){
        for (Listener listener: listeners) {
            listener.publish(mess);
        }
    }

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsAgency newsAgency2 = new NewsAgency();
        System.out.println(newsAgency.equals(newsAgency2));
        newsAgency.subscribe(new Listener() {
            @Override
            public void publish(String message) {
                System.out.println("Listener 1: " + message);
            }
        });

        newsAgency.subscribe(new Listener() {
            @Override
            public void publish(String message) {
                System.out.println("Listener 2: " + message);
            }
        });

        newsAgency.newMessage("Some changes");
    }
}
