package ie.atu.sw;

public class AbsoluteLogBase extends BaseOperation {
    private LogBase logBase;
    
    public AbsoluteLogBase(double base) {
        this.logBase = new LogBase(base);
    }
    
    @Override
    public double execute(double number) {
        return logBase.log(operation(number));
    }
}
