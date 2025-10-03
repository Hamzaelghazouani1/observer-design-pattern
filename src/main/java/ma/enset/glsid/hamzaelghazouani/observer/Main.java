package ma.enset.glsid.hamzaelghazouani.observer;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();

        observable.subscribe(o1);
        observable.subscribe(o2);

        System.out.println("--- State 60 ---");
        observable.setState(60);
        System.out.println("--- State 80 ---");
        observable.setState(80);

        System.out.println("--- Unsubscribe O2 ---");
        observable.unsubscribe(o2);

        System.out.println("--- State 100 ---");
        observable.setState(100);

        System.out.println("--- Anonymous Observer ---");
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable o) {
                if (o instanceof ObservableImpl obs) {
                    System.out.println("Observer Anonymous : Cos(state) = " + Math.cos(obs.getState()));
                }
            }
        });

        System.out.println("--- State 120 ---");
        observable.setState(120);
    }
}
