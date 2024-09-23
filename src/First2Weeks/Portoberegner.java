package First2Weeks;

import java.util.Scanner;




public class Portoberegner {

    static boolean wantToContinue = true;



    public static void PortoBeregner() {
        Scanner scanner = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        boolean correctWeight = true;
        int price = 0;
        double weight = 0;

        System.out.println("Lets see how much would it cost to send a letter in Denmark." +
                "\nPlease enter how much your letter weighs in grams. Only use whole numbers");
        while (correctWeight) {
            weight = scanner.nextDouble();
            if (weight <= 0 || weight % 1 != 0) {
                System.out.println("You need to use a whole number!!!\ntry again.");
            } else {
                correctWeight = false;

            }

        }
        if (weight >= 50 && weight <= 100) {
            price = 25;
        } else if (weight >= 101 && weight <= 250) {
            price = 50;
        } else if (weight >= 75 && weight <= 2000) {
            price = 75;
        } else {
            System.out.println("Sorry we cannot send a letter with the weight you described." +
                    "\nIt has to be between 50 grams and 2000 grams");
        }
        if (price == 0) {
            System.out.println("would you like to try with a different weight?");
            String answer = string.nextLine().trim().toLowerCase();
            if (answer.equals("yes")) {
                System.out.println("Lets Start again...\n  ");
            } else {
                System.out.println("Then Have a good day ;)");
                Portoberegner.wantToContinue = false;
            }
        }
        else{
            System.out.println("It would cost " + price + "kr to send your letter.");
            Portoberegner.wantToContinue = false;

        }
        // 25kr 50-100g; 50kr 101-250gr; 75kr 251-2000gr

    }

    public static void main (String[]args){


        while (Portoberegner.wantToContinue) {
            PortoBeregner();
        }
    }
}