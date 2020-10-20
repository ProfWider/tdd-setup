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
    @DisplayName("should display result after multiplying two positive numbers")
    void calculatorCanDoThreeMultiplyThree() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("9", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after adding three positive numbers")
    void calculatorCanDoTwoPlusTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("6", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after calculating percentage into decimal")
    void calculatorCanDoPercentageToDecimal(){
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDigitKey(5);
        calc.pressOperationKey("%");
        calc.pressEquals();
        assertEquals( "0.15", calc.readScreen());
    }
}