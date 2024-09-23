package ObjectsAndClasses;

import java.util.Scanner;

public class WhichSeason {

    static Scanner scanner = new Scanner(System.in);
    static int userinput;

    public static void main(String[] args) {
        Months month;
        System.out.println("Select a month using one of the numbers: \n1. January \n2. February \n3. March \n4. April \n5. May \n6. June" +
                " \n7. July \n8. August \n9. September \n10. October \n11. November \n12. December");

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
        month = switch (userinput) {
            case 1 -> Months.JANUARY;
            case 2 -> Months.FEBRUARY;
            case 3 -> Months.MARCH;
            case 4 -> Months.APRIL;
            case 5 -> Months.MAY;
            case 6 -> Months.JUNE;
            case 7 -> Months.JULY;
            case 8 -> Months.AUGUST;
            case 9 -> Months.SEPTEMBER;
            case 10 -> Months.OCTOBER;
            case 11 -> Months.NOVEMBER;
            case 12 -> Months.DECEMBER;
            default -> null;
        };


        switch (month){
            case MARCH, APRIL, MAY:
                System.out.println("It is Spring!!!");
                break;
            case JUNE, JULY, AUGUST:
                System.out.println("It is Summer!!!");
                break;
            case SEPTEMBER, OCTOBER, NOVEMBER:
                System.out.println("It is Winter!!!");
                break;
            default:
                System.out.println("It is Fall!!!");


        }







    }

    public static void correction() {
        while (true) {

            if (userinput > 12 || userinput == 0) {
                System.out.println("You need chose a number from the list");
                userinput = scanner.nextInt();
            } else {
                scanner.close();
                break;
            }
        }


    }
}