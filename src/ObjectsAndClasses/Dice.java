package ObjectsAndClasses;

import java.util.Random;
public class Dice {
    Random random = new Random();
    private int MAX;
    private int faceValue;



    public Dice(){

       MAX = 6;
       this.faceValue = random.nextInt(MAX) + 1;

    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll(){

        faceValue = random.nextInt(MAX) + 1;

    }
}
