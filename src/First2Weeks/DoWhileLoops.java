package First2Weeks;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean okay;
        do {
            System.out.println("Enter a number as an integer: ");
            if (scanner.hasNextInt()) {
                okay = true;
            } else {
                okay = false;
                //nedenstående linje får scanneren til at "spise" det forkerte input, og er nødvendig for at komme videre
                scanner.next();
                System.out.println("You did not enter an integer.");
            }
        } while (!okay);
        int number = scanner.nextInt();
        System.out.println("Thank you!");
    }
}

