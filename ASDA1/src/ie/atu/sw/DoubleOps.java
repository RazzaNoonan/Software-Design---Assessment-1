package ie.atu.sw;

//DoubleOps class is the user interface for performing operations.
public class DoubleOps {
    private IOperation operation;// Composition: Holds a reference to the operation
    
    // Constructor that initializes the operation
    public DoubleOps(IOperation operation) {
        this.operation = operation;
    }
    
 // This method is used to execute the chosen operation on the provided input.
    public double process(double number) {
        return operation.execute(number);
    }
}