package strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    public String name;

    public double price;

    public double quantity;

    // Original2
    public int typeIndex = 0;

    // Refactor1st
    public String type;

    public double sum;

    Item(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Item(String name, double price, double quantity, int typeIndex) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.typeIndex = typeIndex;
    }

    Item(String name, double price, double quantity, String type) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }
}
