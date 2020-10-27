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

    //successful
    @Test
    @DisplayName("should display result after multiplying two positive numbers")
    void calculatorCanDoTwoTimesFour()
    {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("x");
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("8", calc.readScreen());
        System.out.println(calc.readScreen());
    }



    //fail
    @Test
    @DisplayName("should display result after addition with dot ")
    void calculatorCanDoAdditionWithDot()
    {
        Calculator calc = new Calculator();

        calc.pressDigitKey(5);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("8.7", calc.readScreen());
        System.out.println(calc.readScreen());
    }






}
