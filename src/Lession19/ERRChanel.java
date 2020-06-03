package Lession19;

public class ERRChanel implements Subscriber{
    @Override
    public void onForecast(WeatherData data) {
        System.out.println("ERR data: "+ data);
    }
}
