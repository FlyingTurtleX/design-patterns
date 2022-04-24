package strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum CashFactoryPlus {

    NORMAL("normal", new CashNormal()),

    OFF_20("20%-off", new CashRebate(0.8)),

    OFF_30("30%-off", new CashRebate(0.7)),

    BACK_30_150("150-30", new CashReturn(150, 30));

    private final String type;

    private final CashSuper cashSuper;

    public static CashSuper getCashSuper(String type) {
        List<CashFactoryPlus> cashFactories = Arrays.stream(CashFactoryPlus.values())
                .filter(cashType -> cashType.getType().equals(type))
                .collect(Collectors.toList());
        if (cashFactories.isEmpty()) {
            return new CashNormal();
        }
        return cashFactories.get(0).getCashSuper();
    }
}
