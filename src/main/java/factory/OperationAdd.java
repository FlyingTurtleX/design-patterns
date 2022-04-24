package factory;

public class OperationAdd implements Operation{
    @Override
    public Double getResult(Double first, Double second) {
        return first + second;
    }
}
