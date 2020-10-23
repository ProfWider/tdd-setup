package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    private String screen = "0";

    private double latestValue;
    private String previousValue = "";
    private double calcValue;

    private String latestOperation = "";

    public String readScreen() {
        return screen;
    }
    public void pressDigitKey(int digit) {
        if (digit > 9 || digit < 0) throw new IllegalArgumentException();
        if (latestOperation.isEmpty()) {
            if (previousValue.isEmpty()) {
                screen = screen + digit;
                previousValue = Integer.toString(digit);
            } else {
                previousValue = previousValue + digit;
                screen = previousValue;
            }
        } else {
            if(previousValue.isEmpty()) {
                latestValue = Double.parseDouble(screen);
                screen =  Integer.toString(digit);
                previousValue = Integer.toString(digit);
            } else {
                previousValue = previousValue + digit;
                latestValue = Double.parseDouble(previousValue);
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
        calcValue = Double.parseDouble(previousValue);
        previousValue = "";
    }
//if user presses dot key, a decimal place will follow
    public void pressDotKey() {
        if(!screen.endsWith(".")) screen = screen + ".";
        previousValue = previousValue + ".";
    }

    public void pressNegative() {
        screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen;
    }

    public void pressEquals() {
        var result = switch(latestOperation) {
            case "+" -> calcValue + latestValue;
            case "-" -> calcValue - latestValue;
            case "x" -> calcValue * latestValue;
            case "/" -> calcValue / latestValue;
            default -> throw new IllegalArgumentException();
        };
        screen = Double.toString(result);
        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }
}
