package observer.climate;

public interface Subscriber {
    public void update(float temperature, float humidity, float pressure);
}
