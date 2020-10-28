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
    @DisplayName("should display result after dividing two positive numbers")
    void calculatorCanDoEightDividedByFour() {
        Calculator c1 = new Calculator();
        c1.pressDigitKey(8);
        c1.pressOperationKey("/");
        c1.pressDigitKey(4);
        c1.pressEquals();
        assertEquals("2", c1.readScreen());
    }

    @Test
    @DisplayName("should display a correct number with a dot") //Code von 2.2.8 auf 1.1+1.1 und davon auf 1.1
    void calculatorCanAdditionWithTwoDots() {
        Calculator c2 = new Calculator();
        c2.pressDigitKey(1);
        c2.pressDotKey();
        c2.pressDigitKey(1);
       /* c2.pressOperationKey("+");
        c2.pressDigitKey(1);
        c2.pressDotKey();
        c2.pressDigitKey(1); */
        assertEquals("1.1", c2.readScreen());
    }
}
