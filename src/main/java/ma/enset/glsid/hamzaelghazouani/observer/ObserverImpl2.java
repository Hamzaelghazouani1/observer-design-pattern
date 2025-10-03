package ma.enset.glsid.hamzaelghazouani.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();

    @Override
    public void update(Observable o) {
        if (o instanceof ObservableImpl obs) {
            int state = obs.getState();
            history.add(state);
            double avg = history.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println("Observer Implementation 2 : Average = " + avg);
        }
    }
}
