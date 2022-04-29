package observer.battle;

public abstract class Colleague {

    public Colleague(String name, Broadcast broadcast) {
        this.name = name;
        this.broadcast = broadcast;
    }

    protected String name;

    protected Broadcast broadcast;

    public abstract void update();
}
