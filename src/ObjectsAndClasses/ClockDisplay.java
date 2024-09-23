package ObjectsAndClasses;

public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public ClockDisplay (){
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
       updateDisplay();
    }

    public void timeTick(){
        minutes.increment();
    if (minutes.getValue() == 0){
        hours.increment();

    }
    updateDisplay();
    }
    public String getDsiplayString(){
        return this.displayString;
    }
// update the display
    private String updateDisplay(){
        return this.displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
