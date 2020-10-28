import tdd.setup.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // cmd+option und v
        calculator.pressDigitKey(3);
        calculator.pressOperationKey("+");
        calculator.pressDigitKey(5);
        calculator.pressEquals();
        System.out.println(calculator.readScreen());
    }
}
