package First2Weeks;

import java.util.Scanner;

public class DoWhileLoops2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean okay = false;
        System.out.println("Enter a number as an integer: ");
        while (!okay) {
            if (scanner.hasNextInt()) {
                okay = true;
            } else {
                okay = false;
                scanner.next();
                System.out.println("You did not enter an integer.");
            }
        }
        System.out.println("Thank you!");
        int number = scanner.nextInt();

    }
}
