package tdd.setup;

import java.math.BigDecimal;
import java.math.MathContext;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    private String screen = "0";

    private String latestValue = "0";

    private String latestOperation = "";

    public String readScreen() {
        return screen;
    }
    public void pressDigitKey(int digit) {
        String s=String.valueOf(latestValue);
        if(digit > 9 || digit < 0) throw new IllegalArgumentException();

        if(latestOperation.isEmpty() && screen.equalsIgnoreCase("0")) {
            screen = screen.substring(1) + digit;
       } else if (latestOperation.isEmpty() && !screen.equalsIgnoreCase("0")) {
            screen = screen + digit;
        } else {
            if(latestValue.equalsIgnoreCase("0")) {
                latestValue = latestValue.substring(1) + digit;
            } else {
                latestValue = latestValue + digit;
            }
        }
    }

    public void pressClearKey() {
        screen = "0";
        latestOperation = "";
        latestValue = "0";
    }

    public void pressOperationKey(String operation)  {
        latestOperation = operation;
    }

    public void pressDotKey() {
        if (!latestOperation.isBlank()) {
            if(!latestValue.endsWith(".")) latestValue = latestValue + ".";
        } else {
            if (!screen.endsWith(".")) screen = screen + ".";
        }
    }

    public void pressNegative() {
        if (!latestOperation.isBlank()) {
            latestValue = latestValue.startsWith("-") ? latestValue.substring(1) : "-" + latestValue;
        } else {
            screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen;
        }
    }

    public void pressEquals() {
        BigDecimal bigDecimalScreen = new BigDecimal(screen);
        BigDecimal bigDecimalLatestValue = new BigDecimal(latestValue);
        BigDecimal result = switch(latestOperation) {
            case "+" -> bigDecimalScreen.add(bigDecimalLatestValue);
            case "-" -> bigDecimalScreen.subtract(bigDecimalLatestValue);
            case "x" -> bigDecimalScreen.multiply(bigDecimalScreen);
            //case "/" -> bigDecimalScreen.divide(bigDecimalLatestValue);
            case "/" -> bigDecimalScreen.divide(bigDecimalLatestValue, MathContext.DECIMAL32);
            default -> throw new IllegalArgumentException();
        };
        screen = result.toString();

        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }
}
