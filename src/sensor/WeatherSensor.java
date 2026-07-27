package sensor;

public class WeatherSensor {

    private String weather;

    public WeatherSensor(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }

    public void displayWeather() {

        System.out.println("Weather : " + weather);

        if (weather.equalsIgnoreCase("Rain")) {
            System.out.println("Drive Carefully");
        }

    }

}
