package decorator;

public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("The dressing style of " + this.name + " is: ");
    }

    public void wear(Person person) {
        if (person != null) {
            person.show();
        }
    }
}
