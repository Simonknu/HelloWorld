package ObjectsAndClasses;

import java.util.ArrayList;

public class Ordrelinje {

    private Vare vare;
    private int antal;



    public Ordrelinje(Vare vare, int antal) {
        this.vare = vare;
        this.antal = antal;

    }

    public double beregnTotalPris() {
        return vare.getPris() * antal;

    }


    public String toString() {
        return antal + " x " + vare.getNavn() + " = " + beregnTotalPris() + "Kr.";
    }

}