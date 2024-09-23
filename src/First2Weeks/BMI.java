package First2Weeks;

import java.util.Scanner;


public class BMI {

    // function to calculate the First2Weeks.BMI.
    public static double BmiCalculator(double weight, double height) {
        return weight / (height * height);

    }

    // Function to define in which category the user is.
    public static String Category(double bmi) {

        if (bmi < 18.5) {
            return ("underweight ");
        } else if (bmi > 25 && bmi < 30) {
            return ("overweight");
        } else if (bmi > 30) {
            return ("very overweight");
        } else {
            return ("normal weight");
        }


    }

    // main code
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean meters = true;
        double height = 4;

        System.out.println("We are going to calculate your BMI (Body-Mass-Index)" +
                " \nPlease write you weight in kg.");
        double weight = input.nextDouble();

        System.out.println("Please write your height in meters.");


        while (meters) {
            height = input.nextDouble();
            if (height > 3) {
                System.out.println("Remember to write your height in meters!!!\ntry again");
            } else {
                meters = false;
            }
        }

        double result = BmiCalculator(weight, height);
        String category = Category(result);
        System.out.println("Your Body-Mass-Index is " + result);
        System.out.println("You are in the " + category + " category.");


    }
}
