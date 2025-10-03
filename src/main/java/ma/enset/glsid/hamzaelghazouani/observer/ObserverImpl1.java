package ma.enset.glsid.hamzaelghazouani.observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable o) {
        if (o instanceof ObservableImpl obs) {
            System.out.println("Observer Implementation 1 : " + obs.getState());
        }
    }
}
