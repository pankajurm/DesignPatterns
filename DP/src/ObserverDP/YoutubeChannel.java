package ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void Subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void Unsubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void newVideoUploaded(String title) {
        for (Observer ob : this.subscribers){
            ob.notified(title);
        }
    }
}
