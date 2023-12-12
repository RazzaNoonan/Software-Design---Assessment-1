package ie.atu.sw;


//BaseOperation abstract class provides a basic structure for operations.
public abstract class BaseOperation implements IOperation {
    protected double threshold = 42.00d;
    protected double operation(double number) {
        return number >= threshold ? Math.abs(number) : number;
    }
}
