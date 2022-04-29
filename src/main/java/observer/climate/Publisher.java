package observer.climate;

public interface Publisher {

    // 注册
    public void registerSubscriber(Subscriber subscriber);

    // 删除
    public void removeSubscriber(Subscriber subscriber);

    // 通知
    public void notifySubscribers();
}
