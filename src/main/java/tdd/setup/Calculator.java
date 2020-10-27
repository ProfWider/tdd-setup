package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    private String screen = "0";

    private double latestValue;

    private String latestOperation = "";

    private int pck = 0;

    public String readScreen() {
        return screen;
    }
    public void pressDigitKey(int digit) {
        if(digit > 9 || digit < 0) throw new IllegalArgumentException();

        if(latestValue != 0 && screen != "0"){
            pressEquals();
            latestValue = digit;
        } else if(latestOperation.isEmpty()) {
            screen = screen + digit;

        }else {
            latestValue = Double.parseDouble(screen);
            screen = Integer.toString(digit);
        }

    }

    public void pressClearKey(){
        if(pck != 0){
            latestValue = 0.0;
            screen = "0";
            latestOperation = "";
            pck = 0;

        }else{
            latestValue = 0.0;
            pck =+1;
        }
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
        var result = switch(latestOperation) {
            case "+" -> latestValue + Double.parseDouble(screen);
            case "-" -> latestValue - Double.parseDouble(screen);
            case "x" -> latestValue * Double.parseDouble(screen);
            case "/" -> latestValue / Double.parseDouble(screen);
            default -> throw new IllegalArgumentException();
        };
        screen = Double.toString(result);
        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }
}
