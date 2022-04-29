package observer.battle;

public class Boss extends Broadcast {
    @Override
    public void informant() {
        for (Colleague colleague : super.colleagues) {
            System.out.println("This is boss fire!");
            colleague.update();
        }
    }
}
