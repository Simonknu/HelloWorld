package First2Weeks;

import java.util.Scanner;
import java.util.Random;

public class StenSaksPapir {
    // create a scanner
    public static Scanner scanner = new Scanner(System.in);
    static int usersPoints = 0;
    static int comPoints = 0;

    //main program


    public static void main(String[] args) {
        System.out.println("Lets play rock paper scissors!!!\n The first one to win 3 times wins the game \nYou choose");
        while (true) {
            game();
            if (usersPoints == 2) {
                System.out.println("You won the game " + usersPoints + " to " + comPoints + "!!!");
                System.out.println("Do you want to play again?");
                String playAgain = scanner.nextLine();
                if (playAgain.equalsIgnoreCase("No")) {
                    break;
                } else {
                    usersPoints = 0;
                    comPoints = 0;
                    System.out.println("Lets play rock paper scissors!!!\nYou choose");
                }
            }

            if (comPoints == 2) {
                System.out.println("You lost the game " + comPoints + " to " + usersPoints + ":(");
                System.out.println("Do you want to play again?");
                String playAgain = scanner.nextLine();
                if (playAgain.equalsIgnoreCase("No")) {
                    break;
                } else {
                    usersPoints = 0;
                    comPoints = 0;
                    System.out.println("Lets play rock paper scissors!!!\nYou choose");
                }
            }


        }


    }


    // check who won
    public static int winLose(String a, String b) {
        // 3 is a tie, 2 user wins, 3 users loses
        if (a.equalsIgnoreCase(b)) {
            return 3;
        } else if (a.equalsIgnoreCase("rock") && b.equalsIgnoreCase("scissors")
                || a.equalsIgnoreCase("scissors") && b.equalsIgnoreCase("paper")
                || a.equalsIgnoreCase("paper") && b.equalsIgnoreCase("rock")) {
            return 1;
        } else if (b.equalsIgnoreCase("rock") && a.equalsIgnoreCase("scissors")
                || b.equalsIgnoreCase("scissors") && a.equalsIgnoreCase("paper")
                || b.equalsIgnoreCase("paper") && a.equalsIgnoreCase("rock")) {
            return 2;
        }
        return 4;
    }


    // game!!!!!!
    public static void game() {
        // create the input from the Computer
        String[] comOptions = {"rock", "paper", "Scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(comOptions.length);
        String comInput = comOptions[randomIndex];
        System.out.println(comInput);


        String userinput = scanner.nextLine(); // users input
        //check if their input is valid


        //check who wins
        int whowon = winLose(userinput, comInput);

        if (whowon == 1) {
            System.out.println("You won with " + userinput + " against " + comInput + "!!!!");
            usersPoints++;
            System.out.println("your points: " + usersPoints + "\n The computers points: " + comPoints);
        } else if (whowon == 2) {
            System.out.println("You lost with " + userinput + " against " + comInput + ":(");
            comPoints++;
            System.out.println("your points: " + usersPoints + "\nComputers points: " + comPoints);
        } else if (whowon == 3) {
            System.out.println("Both chose " + userinput + "\nTry again ");
        } else {
            System.out.println("You can only choose between rock, paper, or scissors.\nTry again");
        }


    }
}









