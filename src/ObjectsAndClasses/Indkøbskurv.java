package ObjectsAndClasses;

import java.util.ArrayList;


public class Indkøbskurv {
    private ArrayList<Ordrelinje> ordrelinjes = new ArrayList<>();


    public Indkøbskurv(){
        this.ordrelinjes = new ArrayList<Ordrelinje>();

    }

    public void addOrdrelinje(Ordrelinje navn){
        ordrelinjes.add(navn);

    }

    public double samletPris() {
        double totalPris = 0;
        for (Ordrelinje ordrelinje : ordrelinjes) {
            totalPris += ordrelinje.beregnTotalPris();
        }
        return totalPris;


    }
    public String toString() {
        String result= "";
        for (Ordrelinje ordrelinje : ordrelinjes) {
            result += ordrelinje.toString() + "\n";
        }
        return result;


    }
}
