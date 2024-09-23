package ObjectsAndClasses;

public class DigitalClockDemo {
    public static void main(String[] args) {

        ClockDisplay clockDisplay = new ClockDisplay();


            for (int i = 0; i < 1440; i++) {
                System.out.println(clockDisplay.getDsiplayString());
                clockDisplay.timeTick();
                try {
                    // Pause for 1 second (1000 milliseconds)
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }


    }
}
