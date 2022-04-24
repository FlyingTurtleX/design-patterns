package factory;

public class OperationMutiply implements Operation{
    @Override
    public Double getResult(Double first, Double second) {
        return first *second;
    }
}
