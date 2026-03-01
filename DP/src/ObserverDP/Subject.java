package ObserverDP;

public interface Subject {

    void Subscribe(Observer ob);
    void Unsubscribe(Observer ob);
    void newVideoUploaded(String title);

}
