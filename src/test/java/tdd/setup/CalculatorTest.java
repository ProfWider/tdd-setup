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
        @DisplayName("should display result after clearing display")
        void calculatorCanResetAllNumbersOnDisplay() {
            Calculator calc = new Calculator();
            calc.pressDigitKey(2);
            calc.pressOperationKey("+");
            calc.pressDigitKey(2);
            calc.pressEquals();
            calc.pressClearKey();
            assertEquals("0", calc.readScreen());
        }

            @Test
            @DisplayName("should display result after adding two decimal numbers")
            void calculatorCanAddTwoDecimalNumbers() {
                Calculator calc = new Calculator();
                calc.pressDigitKey(2);
                calc.pressDotKey();
                calc.pressDigitKey(2);
                calc.pressOperationKey("+");
                calc.pressDigitKey(2);
                calc.pressDotKey();
                calc.pressDigitKey(2);
                calc.pressEquals();
                assertEquals("4.4", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after adding two negative numbers")
    void calculatorCanAddTwoNegativeNumbers() {
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("-4", calc.readScreen());
    }

}
