import java.util.Observable;
import java.util.Random;

public class WeatherStation extends Observable {

    private int temp;
    private int humidity;
    private float pressure;

    public void calcMeasurements() {
        System.out.println("--------------");
        Random random = new Random();

        temp = random.nextInt(50);
        humidity = random.nextInt(100);
        pressure = random.nextFloat();

        setChanged();
        notifyObservers(new Status(temp, humidity, pressure));
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
