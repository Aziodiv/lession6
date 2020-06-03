package Lession19;

public class PostimeesChannel  implements Subscriber{
    @Override
    public void onForecast(WeatherData data) {
        System.out.println("Postimees wind direction: "+ data.getWindDirection());

    }
}
