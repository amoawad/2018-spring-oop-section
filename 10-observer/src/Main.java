public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        IndoorDisplay indoorDisplay = new IndoorDisplay();
        OutdoorDisplay outdoorDisplay = new OutdoorDisplay();
        HumanWatcher humanWatcher = new HumanWatcher();

        weatherStation.addObserver(indoorDisplay);
        weatherStation.addObserver(outdoorDisplay);
        weatherStation.addObserver(humanWatcher);

        weatherStation.calcMeasurements();

        weatherStation.deleteObserver(humanWatcher);

        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
        weatherStation.calcMeasurements();
    }

}
