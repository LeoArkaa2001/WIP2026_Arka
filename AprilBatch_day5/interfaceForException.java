package AprilBatch_day5;

interface Division {
    void divide(int a, int b);
}

class CalculatorImpl implements Division {

    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}

public class interfaceForException {
    public static void main(String[] args) {
        CalculatorImpl calc = new CalculatorImpl();

        calc.divide(10, 2);  // valid
        calc.divide(10, 0);  // exception case
    }
}