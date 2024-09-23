package ObjectsAndClasses;

import java.util.Scanner;

public class SchoolDaysOrWeekend {

    static Scanner scanner = new Scanner(System.in);
    static int userinput;

    public static void main(String[] args) {
        Weekday weekday;
        System.out.println("Select a day using one of the numbers: \n1. Monday \n2. Tuesday \n3. Wednesday \n4. Thursday \n5. Friday \n6. Saturday \n7. Sunday");

        //check if the input is an int
        while (true) {
            if (scanner.hasNextInt()) {
                userinput = scanner.nextInt();
                break;
            } else {
                System.out.println("You need to input a whole number. Try again");
                scanner.next();
            }
        }
        // check if the value is correct
        correction();
// give a day to the number they chose
        weekday = switch (userinput) {
            case 1 -> Weekday.MONDAY;
            case 2 -> Weekday.TUESDAY;
            case 3 -> Weekday.WEDNESDAY;
            case 4 -> Weekday.THURSDAY;
            case 5 -> Weekday.FRIDAY;
            case 6 -> Weekday.SATURDAY;
            case 7 -> Weekday.SUNDAY;
            default -> null;

        };
// write if it is a weekend or a weekday
        switch (weekday) {
            case Weekday.SUNDAY, Weekday.SATURDAY:
                System.out.println("It is the weekend!!!");
                break;
            case null:
                break;
            default:
                System.out.println("It is a weekday :((((");

        }

        // last opgave

        if (userinput < 6) {
            if (userinput == 1) {
                System.out.println("It's Monday again. You have to go to school :(");
            } else if (userinput == 5) {
                System.out.println("You have to go to school, But you have the weekend off!");
            }

        } else {
            System.out.println("It's the weekend, go back to sleep");
        }
    }

    // check they wrote the right number
    public static void correction() {
        while (true) {

            if (userinput > 7 || userinput == 0) {
                System.out.println("You need chose a number from the list");
                userinput = scanner.nextInt();
            } else {
                scanner.close();
                break;
            }
        }


    }
}
