package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    private String screen = "";

    private String latestValue = "";

    private String latestOperation = "";

    public String readScreen() {
        return screen;
    }
    public void pressDigitKey(int digit) {
        if(digit > 9 || digit < 0) throw new IllegalArgumentException();

        if(latestOperation.isEmpty()) {
            screen = screen + digit;
        } else {
            latestValue = latestValue + digit;


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
        if(!latestValue.endsWith(".") && latestValue != "") {
            latestValue = latestValue + ".";

        } else if(!screen.endsWith(".")) {
            screen = screen + ".";
        }
    }

    public void pressNegative() {
        screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen;
    }

    public void pressEquals() {
        var result = switch(latestOperation) {
            case "+" -> Double.parseDouble(latestValue) + Double.parseDouble(screen);
            case "-" -> Double.parseDouble(latestValue) - Double.parseDouble(screen);
            case "x" -> Double.parseDouble(latestValue) * Double.parseDouble(screen);
            case "/" -> Double.parseDouble(latestValue) / Double.parseDouble(screen);
            default -> throw new IllegalArgumentException();
        };
        screen = Double.toString(result);
        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }
}
