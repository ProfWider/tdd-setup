package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display results after 5 - 4")
    void calculatorCanDo5Minus4(){
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("-");
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("1", calc.readScreen());
    }
    @Test
    @DisplayName("should display results after press 8 ,., 5")
    void calculatorCanDoDoubleNumber(){
        Calculator calc = new Calculator();
        calc.pressDigitKey(8);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        assertEquals("8.5", calc.readScreen());
    }
    @Test
    @DisplayName("should display results after ")
    void calculatorCanDoNumber(){
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("+");
        calc.pressDigitKey(1);
        calc.pressDigitKey(5);
        calc.pressEquals();
       assertEquals("20", calc.readScreen());
    }


}
