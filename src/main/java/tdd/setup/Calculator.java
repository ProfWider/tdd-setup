package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    private String screen = "0";

    private double latestValue;
    private double firstValue;

    private String latestOperation = "";

    public String readScreen() {
        return screen;
    }
    public void pressDigitKey(int digit) {
        if(digit > 9 || digit < 0) throw new IllegalArgumentException();
        screen += Integer.toString(digit);
        latestValue = Double.parseDouble(screen);
    }

    public void pressClearKey() {
        screen = "0";
        latestOperation = "";
        latestValue = 0.0;
    }

    public void pressOperationKey(String operation)  {
        if (latestOperation != "") {
            pressEquals();
        }
        latestOperation = operation;
        firstValue = Double.parseDouble(screen);
        screen = "0";
    }

    public void pressDotKey() {
        if(!screen.endsWith(".")) screen = screen + ".";
    }

    public void pressNegative() {
        screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen;
    }

    public void pressEquals() {
        var result = switch(latestOperation) {
            case "+" -> firstValue + latestValue;
            case "-" -> firstValue - latestValue;
            case "x" -> firstValue * latestValue;
            case "/" -> firstValue / latestValue;
            case "" -> latestValue;
            default -> throw new IllegalArgumentException();
        };
        screen = Double.toString(result);
        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }
}
