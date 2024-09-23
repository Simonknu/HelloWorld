package ObjectsAndClasses;

public class RoomWithLamp {

    public static void main(String[] args) {


        Lamp deskLamp = new Lamp(true);
        Lamp bedSideLamp = new Lamp(false);
        Lamp defaultlamp = new Lamp();

        System.out.println(deskLamp.getCountLamps());
        System.out.println(bedSideLamp.toString());
        System.out.println(deskLamp.toString());
        System.out.println(defaultlamp.toString());
        deskLamp.countlamps();

    }

}
