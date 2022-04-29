package observer.battle;

public class BilibiliColleague extends Colleague{

    public BilibiliColleague(String name, Broadcast broadcast) {
        super(name, broadcast);
    }

    @Override
    public void update() {
        System.out.println(this.name + ", " + broadcast.getAction() + " Stop watching Bilibili!");
    }
}
