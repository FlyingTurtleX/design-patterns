package decorator;

public class Original {

    public void decorate() {
        Person cai = new Person("Little Cai");
        cai.show();

        Wardrobe shirt = new Shirts();
        Wardrobe trousers = new Trousers();
        Wardrobe shoes = new Shoes();
        Wardrobe dress = new Dress();
        shirt.show();
        trousers.show();
        shoes.show();
        dress.show();
    }

}
