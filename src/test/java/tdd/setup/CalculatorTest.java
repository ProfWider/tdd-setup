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
    //Green Test
    @Test
    @DisplayName("should clear the display")
    void calculatorCanDoCLear() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressOperationKey("+");
        calc.pressDigitKey(1);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
        System.out.println(calc.readScreen());
    }
    //First red test
    @Test
    @DisplayName("should sum up two double figure digit numbers")
    void calculatorCanSumDoubleDigitNumbers() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDigitKey(3);
        calc.pressOperationKey("+");
        calc.pressDigitKey(1);
        calc.pressDigitKey(1);
        calc.pressEquals();
        assertEquals("24", calc.readScreen());
        System.out.println(calc.readScreen());
    }
    //second red test
    @Test
    @DisplayName("should multiply two times in a row ")
    void calculatorCanMultiplyTwoTimesInaRow() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("54", calc.readScreen());
        System.out.println(calc.readScreen());
    }
}
