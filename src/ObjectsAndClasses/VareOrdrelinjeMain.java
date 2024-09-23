package ObjectsAndClasses;

public class VareOrdrelinjeMain {
    public static void main(String[] args) {

        Vare milk = new Vare("Milk", 7);
        Ordrelinje ordrelinje1 = new Ordrelinje(milk, 3);
        Ordrelinje ordrelinje2 = new Ordrelinje(milk, 5);
        Indkøbskurv indkøbskurv = new Indkøbskurv();

        indkøbskurv.addOrdrelinje(ordrelinje1);
        indkøbskurv.addOrdrelinje(ordrelinje2);

        System.out.println(indkøbskurv.samletPris());

        System.out.println(indkøbskurv.toString());
    }



}
