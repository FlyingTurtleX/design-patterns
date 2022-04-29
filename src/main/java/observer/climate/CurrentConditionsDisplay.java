package observer.climate;

public class CurrentConditionsDisplay implements ElementDisplay, Subscriber {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Publisher weatherData) {
        weatherData.registerSubscriber(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
