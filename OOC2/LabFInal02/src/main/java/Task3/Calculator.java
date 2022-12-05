package Task3;


public class Calculator implements Operation<Double>{

    @Override
    public Double add(Double double1, Double double2) {
        return double1 + double2;
    }

    @Override
    public Double subtract(Double double1, Double double2) {
        return double1 - double2;
    }

    @Override
    public Double multiply(Double double1, Double double2) {
        return double1 * double2;
    }

    @Override
    public Double divide(Double double1, Double double2) {
        return double1 / double2;
    }
}
