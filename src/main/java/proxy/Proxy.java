package proxy;

public class Proxy implements ServiceInterface{

    private final ServiceInterface service;

    public Proxy(Service service) {
        this.service = service;
    }

    @Override
    public void operation() {
        System.out.println("I am the proxy of the Service!");
        service.operation();
    }
}
