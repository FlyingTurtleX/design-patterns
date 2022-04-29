package observer.climate;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher {
    private final List<Subscriber> subscribers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        int i = subscribers.indexOf(subscriber);
        if (i >= 0) {
            subscribers.remove(i);
        }
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(temperature, humidity, pressure);
        }
    }

    // 观察者模式入口
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 当数据改变时通知Subscribers
    public void measurementsChanged() {
        notifySubscribers();
    }
}
