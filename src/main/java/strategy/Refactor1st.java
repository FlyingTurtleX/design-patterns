package strategy;

import java.util.ArrayList;

public class Refactor1st {

    public double total = 0.0;
    public ArrayList<Item> items = new ArrayList<>();

    public void cashierClick(Item item) {
        CashSuper cashSuper = CashFactory.createCashType(item.type);
        double sum = cashSuper.acceptCash(item.price * item.quantity);
        item.setSum(sum);
        total = total + sum;
        items.add(item);
    }

    public void billPrint() {
        System.out.format("%8s%12s%12s%12s%12s\n", "name", "price", "quantity", "type", "sum");
        for (Item i : items) {
            System.out.format("%8s%12.2f%12.2f%12s%12.2f\n",
                    i.name, i.price, i.quantity, i.type, i.sum);
        }
        System.out.println();
        System.out.format("%8s%48.2f\n", "total", total);
        System.out.println();
    }
}
