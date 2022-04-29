package observer.battle;

/**
 * The biggest problem is:
 * when action or state changed,
 * notifying is not automatically triggered.
 * But in the climate example,
 * data change and notifying is united as one.
 */
public class Practice {

    public void practice() {
        Broadcast secretary = new Secretary();
        Colleague vivi = new StockColleague("Vivi", secretary);
        Colleague jayden = new StockColleague("Jayden", secretary);
        Colleague sylvia = new BilibiliColleague("Sylvia", secretary);
        secretary.add(vivi);
        secretary.add(jayden);
        secretary.add(sylvia);
        secretary.setAction("boss is coming!");
        secretary.informant();
        secretary.remove(sylvia);
        System.out.println(secretary.colleagues.size());

        Boss boss = new Boss();
        sylvia = new BilibiliColleague("Sylvia", boss);
        boss.add(sylvia);
        boss.setAction("no more next time!");
        boss.informant();

    }
}
