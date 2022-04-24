package strategy;

import java.util.ArrayList;

public class Original2 {

    public double total = 0.0;
    public ArrayList<Item> items = new ArrayList<>();
    public String[] types = new String[] {"normal", "20%-off", "30%-off", "50%-off"};
//    public double[] discount = new double[] {1, 0.8, 0.7, 0.5};

    public void cashierClick(Item item) {

        double sum = 0.0;
        switch (item.typeIndex) {
            case 0:
                sum = item.price * item.quantity;
                break;
            case 1:
                sum = item.price * item.quantity * 0.8;
                break;
            case 2:
                sum = item.price * item.quantity * 0.7;
                break;
            case 3:
                sum = item.price * item.quantity * 0.5;
        }
        item.setType(types[item.getTypeIndex()]);
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
