package ObjectsAndClasses;

public class Greeting {



    public static void main(String[] args) {
/*
        String simon = hello("Simon");
        String Matias = hello("Matias");
        String Ana = hello("Ana");

        System.out.println(simon);
        System.out.println(Matias);
        System.out.println(Ana);
*/

    Greeting greeting = new Greeting();


    greeting.hello("Simon");



    }
/*
    public static String hello(String name){
        return  "Hello " + name;

    }
*/




    public void hello(String name){
        System.out.println("Hello " + name);

    }
}
