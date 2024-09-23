package ObjectsAndClasses;

public class Car {

    private String color;
    private double price;
    private int mileage;


    public Car(String color,int mileage, double price){
    this.color = color;
    this.mileage = mileage;
    this.price = price;
    }

    public void run(int mileage){
        this.mileage = this.mileage + mileage;
    }

    public double newPrice(double newPrice){
        price = newPrice;
        return price;
    }

    public String toString(){
        return "The car is " + color + ". It has "+ mileage + " km of mileage. It costs " + price + "Kr.";
    }

    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }




}
