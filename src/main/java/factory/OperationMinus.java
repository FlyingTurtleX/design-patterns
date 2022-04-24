package factory;

public class OperationMinus implements Operation{
    @Override
    public Double getResult(Double first, Double second) {
        return first - second;
    }
}
