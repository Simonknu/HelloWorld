package ObjectsAndClasses;

public class Person {

    public String firstName;
    private String lastName;
    private double shoeSize;

    public Person(String firstName, String lastName, double shoeSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.shoeSize = shoeSize;
    }

    public void printPerson (){
        System.out.println("Name: " + this.firstName + "\nLast name: " + this.lastName + "\nShoe size: " + this.shoeSize);
    }

}
