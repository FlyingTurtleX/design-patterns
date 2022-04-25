package decorator;

public abstract class Wardrobe extends Person {

    public abstract void show();
}

class Shirts extends Wardrobe {

    @Override
    public void show() {
        System.out.println("shirt");
    }
}

class Trousers extends Wardrobe {

    @Override
    public void show() {
        System.out.println("trousers");
    }
}

class Shoes extends Wardrobe {

    @Override
    public void show() {
        System.out.println("shoes");
    }
}

class Dress extends Wardrobe{
    @Override
    public void show() {
        System.out.println("dress");
    }
}
