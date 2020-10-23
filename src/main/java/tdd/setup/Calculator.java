package tdd.setup;


import java.math.BigDecimal;
import java.math.MathContext;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    //0 in screen causes faulty display of digits
    private String screen = "";

    public double latestValue;

    private String latestOperation = "";

    BigDecimal a, b;


    public String readScreen() {
        return screen;
    }
    public void pressDigitKey(int digit) {
        if(digit > 9 || digit < 0) throw new IllegalArgumentException();

        if(latestOperation.isEmpty()) {
            screen = screen + digit;
        } else {
            if (screen.endsWith(".")) {
                screen = screen + digit;
            }
            else {
                latestValue = Double.parseDouble(screen);
                screen = Integer.toString(digit);
            }
        }
    }

    public void pressClearKey() {
        screen = "0";
        latestOperation = "";
        latestValue = 0.0;
    }

    public void pressOperationKey(String operation)  {
        latestOperation = operation;
    }

    public void pressDotKey() {
        if(!screen.endsWith(".")) screen = screen + ".";
    }

    public void pressNegative() {
        screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen;
    }

    public void pressEquals() {
        String convertedDouble = Double.toString(latestValue);

        a = new BigDecimal(convertedDouble);
        b = new BigDecimal(screen);

        var result = switch(latestOperation) {
            case "+" -> a.add(b, MathContext.DECIMAL64);
            case "-" -> a.subtract(b, MathContext.DECIMAL64);
            case "x" -> a.multiply(b, MathContext.DECIMAL64);
            case "/" -> a.divide(b, MathContext.DECIMAL64);
            default -> throw new IllegalArgumentException();
        };
        screen = result.toString();
        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }
}
