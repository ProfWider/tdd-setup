package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display result after adding two positive numbers")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }
    //second failed test
    @Test
    @DisplayName("should display the hundredth of the digit on the screen after pressing %")
    void calculatorCanDoTwoHundertstel() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressFunctionKey("%");
        assertEquals("0.02", calc.readScreen());
    }
}
