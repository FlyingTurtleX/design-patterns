package strategy;

import java.util.ArrayList;

/**
 * Cash Register(收银机).
 */
public class Original1 {

    public double total = 0.0;
    public ArrayList<Item> items = new ArrayList<>();

    public void cashierClick(Item item) {
        double sum = item.price * item.quantity;
        item.setSum(sum);
        total = total + sum;
        items.add(item);
    }

    public void billPrint() {
        System.out.format("%8s%12s%12s%12s\n", "name", "price", "quantity", "sum");
        for (Item i : items) {
            System.out.format("%8s%12.2f%12.2f%12.2f\n",
                    i.name, i.price, i.quantity, i.sum);
        }
        System.out.println();
        System.out.format("%8s%36.2f\n", "total", total);
        System.out.println();
    }
}
