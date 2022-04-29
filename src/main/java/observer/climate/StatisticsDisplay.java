package observer.climate;

public class StatisticsDisplay implements ElementDisplay, Subscriber {

    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Publisher weatherData) {
        weatherData.registerSubscriber(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("temperature/humidity/pressure: " + temperature + "F/"+ humidity + "%/" + pressure + "Pa");
    }
}
