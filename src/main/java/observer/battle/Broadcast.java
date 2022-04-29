package observer.battle;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public abstract class Broadcast {

    public final List<Colleague> colleagues = new ArrayList<>();

    @Setter
    @Getter
    private String action;

    public void add(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void remove(Colleague colleague) {
        colleagues.remove(colleague);
    }

    public abstract void informant();

}
