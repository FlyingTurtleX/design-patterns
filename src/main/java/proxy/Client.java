package proxy;

public class Client {

    private final Proxy proxy = new Proxy(new Service());

    public void proxy() {
        proxy.operation();
    }
}
