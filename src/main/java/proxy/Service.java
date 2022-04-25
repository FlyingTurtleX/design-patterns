package proxy;

public class Service implements ServiceInterface{
    @Override
    public void operation() {
        System.out.println("I am the true service!");
    }
}
