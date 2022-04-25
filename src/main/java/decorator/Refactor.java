package decorator;

public class Refactor {

    public void decorate() {
        Person cai = new Person("Little Cai");

        Wardrobe shirt = new Shirts();
        Wardrobe trousers = new Trousers();
        Wardrobe shoes = new Shoes();

        cai.show();
        cai.wear(shirt);
        shirt.wear(trousers);
        trousers.wear(shoes);
    }
}
