package observer.climate;

public class ForecastDisplay implements ElementDisplay, Subscriber{
    private float currentPressure = 29.92f;
    private float lastPressure;

    // 构造器：将 Subscriber注册到 Publisher
    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerSubscriber(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
