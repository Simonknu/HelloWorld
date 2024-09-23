package ObjectsAndClasses;

public class NumberDisplay {
    private int limit;
    private int value;


    public NumberDisplay(int rollOverLimit) {
    limit = rollOverLimit;
    value = 0;

    }
// get the value of minutes or hours
    public int getValue(){
        return value;
    }

    public void setValue(int replacementValue){
        if (replacementValue > 0 && replacementValue < limit){
            value = replacementValue;
        }
    }
    // increment the value
    public void increment(){
        value = (value + 1) % 60;
    }

    public String getDisplayValue(){
        if (value < 10){
            return "0" + value;
        }
        return "" + this.value;
    }

}
