package ObjectsAndClasses;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numToGuess = (int) (Math.random() * 10) + 1;
             System.out.println("Guess a number between 1 and 10");
             int numGuessed = 0;
             int timesGuessed = 0;

            do {
                 numGuessed = scanner.nextInt();
                timesGuessed = timesGuessed + 1;
                 if (numGuessed < 0 || numGuessed > 10){
                     System.out.println("It need to be bewteen 1 and 10!!");

                 }
                else if (numGuessed == numToGuess){
                    System.out.println("you win!!! my number was " + numToGuess);
                    System.out.println("It took you " + timesGuessed + " to answer correclty");

                } else if(numGuessed < numToGuess) {
                    System.out.println("go a little bit higher");
                    System.out.println("Try again");


                } else if (numGuessed > numToGuess){
                    System.out.println("go a little bit lower");
                    System.out.println("Try again");


                }

         } while (numGuessed != numToGuess);

    }
}
