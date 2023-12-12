package ie.atu.sw;

public class AbsoluteLogBaseBitFlipper extends AbsoluteLogBase {
    public AbsoluteLogBaseBitFlipper(double base) {
        super(base);
    }

    public double flip(double value) {
        long temp = Double.doubleToLongBits(super.execute(value));
        return Double.longBitsToDouble(~temp);
    }
}
