package factory;

public class OperationDivide implements Operation{
    @Override
    public Double getResult(Double first, Double second) {
        return first / second;
    }
}
