package HW.hw_7;

public class SubtractionAdapter implements Calculator {

    private Subtraction subtraction;

    public SubtractionAdapter(Subtraction subtraction) {
        this.subtraction = subtraction;
    }

    @Override
    public ComplexNumber calculate(ComplexNumber number1, ComplexNumber number2) {
        return subtraction.subtract(number1, number2);
    }

    @Override
    public void calculate(ComplexNumber number1, String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculate'");
    }
}
