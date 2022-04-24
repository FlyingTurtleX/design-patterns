package strategy;

public abstract class CashSuper {
    abstract double acceptCash(double money);
}

class CashNormal extends CashSuper {
    @Override
    double acceptCash(double money) {
        return money;
    }
}

class CashRebate extends CashSuper {
    double cashRebate;

    CashRebate(double cashRebate) {
        this.cashRebate = cashRebate;
    }

    @Override
    double acceptCash(double money) {
        return money * cashRebate;
    }
}

class CashReturn extends CashSuper {
    double cashCondition;
    double cashReturn;

    CashReturn(double cashCondition, double cashReturn) {
        this.cashCondition = cashCondition;
        this.cashReturn = cashReturn;
    }

    @Override
    double acceptCash(double money) {
        if (money >= cashCondition) {
            // stackable
            return money - Math.floor(money / cashCondition) * cashReturn;
        }
        return money;
    }
}
