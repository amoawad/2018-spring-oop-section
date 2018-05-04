import java.util.Observable;
import java.util.Observer;

public class OutdoorDisplay implements Observer {

    public void update(Observable observable, Object Message) {
        WeatherStation ws = (WeatherStation) observable;
        System.out.println("Outdoor Display - T: " + ws.getTemp() + ", " + ws.getHumidity() + ", " + ws.getPressure());
    }

}
