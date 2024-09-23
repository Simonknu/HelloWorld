package First2Weeks;

import java.util.Scanner;

public class TommeBeregner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double INCHES_IN_CM = 2.54;

        System.out.println("Please write the Number you want to convert into inches");
        double inches = scanner.nextDouble();
        double result = inches * INCHES_IN_CM ;
        System.out.println(inches +" inches in centimeters are: " + result + " centimeters.");
    }




}
