package strategy;

public class CashFactory {

    public static CashSuper createCashType(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "20%-off":
                cashSuper = new CashRebate(0.8);
                break;
            case "150-30":
                cashSuper = new CashReturn(150, 30);
        }
        return cashSuper;
    }
}
