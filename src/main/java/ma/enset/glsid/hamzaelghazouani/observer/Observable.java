package ma.enset.glsid.hamzaelghazouani.observer;

public interface Observable {
    void subscribe(Observer o);

    void unsubscribe(Observer o);

    void notifyObservers();
}
