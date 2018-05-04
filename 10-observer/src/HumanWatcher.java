import java.util.Observable;
import java.util.Observer;

public class HumanWatcher implements Observer {
    @Override
    public void update(Observable observable, Object message) {
        Status status = (Status) message;
        System.out.println("Human: " + status.getTemp() + ", " + status.getHumidity() + ", " + status.getPressure());
    }
}
