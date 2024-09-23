package ObjectsAndClasses;

public class Lamp {
    private static int countLamps = 0;
    boolean onOff;

    public Lamp(boolean onOff) {
        this.onOff = onOff;
        countLamps ++;
    }

    public Lamp() {
        this.onOff = false;
        countLamps ++;

    }

    public void pressOnSwitch() {
        if (onOff) {
            onOff = false;
        } else {
            onOff = true;
        }
    }

    public int getCountLamps(){
        return countLamps;
    }

    public void countlamps(){

        System.out.println("There are " + countLamps + " in the room." );
    }

    public String toString(){
        if (onOff){
            return "The Lamp is on";
        } else{
            return "The Lamp is off";
        }
    }
}


