package observer.battle;

public class Secretary extends Broadcast {

    @Override
    public void informant() {
        for (Colleague colleague : super.colleagues) {
            System.out.println("This is secretary warning!");
            colleague.update();
        }
    }

}
