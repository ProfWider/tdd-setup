package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    private String screen = "0";

    private double latestValue;

    private int counter = 0;

    private String latestOperation = "";

    public String readScreen() {
        return screen;
    }
    public void pressDigitKey(int digit) {
        if(digit > 9 || digit < 0) throw new IllegalArgumentException(); //CHANGE REQUESTED

        if(latestOperation.isEmpty()) {
            screen = screen + digit;
        } else {
            latestValue = Double.parseDouble(screen);
            screen = Integer.toString(digit);
        }
    }


    public void pressClearKey() {
        if (counter==0 ){
            screen = "0";
            counter ++;}
        else {
            screen = "0";
            latestOperation = "";
            latestValue = 0.0;
            counter = 0;
        }
    }

    public void pressOperationKey(String operation)  {
        String save = operation;
        if (latestOperation == "") {
            latestOperation = save;
        }else{
            latestValue =getResult();
            latestOperation =save;
        }
    }


    public void pressDotKey() {
        if(!screen.endsWith(".")) screen = screen + ".";
    }



    public void pressNegative() {
        if( latestOperation == "-"){
            latestOperation = "+";
        }
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
      public double getResult(){ //dient nur als Hilfsmethode
        double result = switch(latestOperation) {
            case "+" -> latestValue + Double.parseDouble(screen);
            case "-" -> latestValue - Double.parseDouble(screen);
            case "x" -> latestValue * Double.parseDouble(screen);
            case "/" -> latestValue / Double.parseDouble(screen);
            default -> throw new IllegalArgumentException();
        };
          screen = Double.toString(result);
          if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
        return result;

    }


}
