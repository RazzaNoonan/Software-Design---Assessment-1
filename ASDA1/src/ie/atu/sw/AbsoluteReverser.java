package ie.atu.sw;

public class AbsoluteReverser extends BaseOperation {
    @Override
    public double execute(double number) {
        long temp = Double.doubleToLongBits(operation(number));
        return Double.longBitsToDouble(Long.reverse(temp));
    }
}