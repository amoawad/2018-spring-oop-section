import java.util.Observable;
import java.util.Observer;

public class IndoorDisplay implements Observer {

    public void update(Observable observable, Object Message) {
        WeatherStation ws = (WeatherStation) observable;
        System.out.println("Indoor Display - T: " + ws.getTemp() + ", " + ws.getHumidity() + ", " + ws.getPressure());
    }

}
