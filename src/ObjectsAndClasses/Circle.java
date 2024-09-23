package ObjectsAndClasses;

public class Circle {
    public double radius;

    public Circle(double radius){
        this.radius = radius;

    }
    public double findArea(){

        return Math.PI *(Math.pow(this.radius, 2));
    }
}
