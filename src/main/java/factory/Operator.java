package factory;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum Operator {

    ADD("+", Double::sum),

    MINUS("-", (first, second) -> first - second),

    MULTIPLY("*", new Operation() {
        @Override
        public Double getResult(Double first, Double second) {
            return first * second;
        }
    }),

    DIVIDE("/", new OperationDivide());

    private final String operator;

    private final Operation operation;

    Operator(String operator, Operation operation) {
        this.operator = operator;
        this.operation = operation;
    }

    public String getOperator() {
        return operator;
    }

    public Operation getOperation() {
        return operation;
    }

    public static Operator getTargetOperator(String symbol) {
        return Arrays.stream(Operator.values())
                .filter(operator -> operator.getOperator().equals(symbol))
                .collect(Collectors.toList()).get(0);
    }
}
