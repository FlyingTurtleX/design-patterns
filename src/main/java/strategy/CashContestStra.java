package strategy;

public class CashContestStra {

    private final Item item;
    private final CashSuper cashSuper;

    public CashContestStra(Item item) {
        this.item = item;
        this.cashSuper = CashFactoryPlus.getCashSuper(item.type);
    }

    public double getTotal() {
        return cashSuper.acceptCash(item.price * item.quantity);
    }
}
