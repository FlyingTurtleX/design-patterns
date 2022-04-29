package observer.battle;

public class StockColleague extends Colleague{

    public StockColleague(String name, Broadcast broadcast) {
        super(name, broadcast);
    }

    @Override
    public void update() {
        System.out.println(this.name + ", " + broadcast.getAction() + " Stop stock research!");
    }
}
