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
    @Test
    @DisplayName("should display the square of three")
    void calculatorCanDoTheSquareOfThree() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("9", calc.readScreen());
    }
    @Test
    @DisplayName("should enable you to use calculate with a negativ number")
    void cando() {
        Calculator calc3 = new Calculator();
        calc3.pressDigitKey(2);
        calc3.pressOperationKey("-");
        calc3.pressDigitKey(-2);
        calc3.pressEquals();
        assertEquals("4", calc3.readScreen());
    }
    @Test
    @DisplayName("should enable you to calculate multiple numbers")
    void mrmeeseek() {
        Calculator calc3 = new Calculator();
        calc3.pressDigitKey(2);
        calc3.pressOperationKey("+");
        calc3.pressDigitKey(2);
        calc3.pressOperationKey("+");
        calc3.pressDigitKey(2);
        calc3.pressEquals();
        assertEquals("6", calc3.readScreen());
    }
}



