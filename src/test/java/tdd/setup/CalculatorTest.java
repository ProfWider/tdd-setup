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
    void calculatorCanShowNegativeValues() {
        Calculator calc= new Calculator();
        calc.pressDigitKey(2);
        calc.pressNegative();
        assertEquals("-2", calc.readScreen());

    }

    @Test
    @DisplayName("the results do not start with the int '0'")
    void doesntShowNullAtBeginning(){
        Calculator calc= new Calculator();
        calc.pressDigitKey(3);
        calc.pressDigitKey(2);
        calc.pressDigitKey(3);
        assertEquals("323",calc.readScreen());
    }

    @Test
    @DisplayName("Division durch null" )
    void cantDivideByZero(){
        Calculator calc=new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("/");
        calc.pressDigitKey(0);
        calc.pressEquals();
        assertEquals("Error", calc.readScreen());
    }
}
