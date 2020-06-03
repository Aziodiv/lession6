package Lession19;

public class DelfiChannel implements Subscriber {
    @Override
    public void onForecast(WeatherData data) {
        System.out.println("Delfi themperature: "+ data.getTemperature());

    }
}
