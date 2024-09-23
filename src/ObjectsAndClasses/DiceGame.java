package ObjectsAndClasses;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        int count = 0;
        String yes = null;
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Scanner scanner = new Scanner(System.in);

        System.out.println("lets play snake eyes!\nYou need to get two ones to win. Write roll to play");
        while (true) {
            String roll = scanner.next();
            if (roll.equalsIgnoreCase("roll")) {
                do {
                    dice1.roll();
                    dice2.roll();
                    System.out.println("First dice: " + dice1.getFaceValue() + "\n Second dice: " + dice2.getFaceValue());
                    if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1) {
                        System.out.println("Snake eyes!! \nIt took you "  + count + " rolls to win!!\n Do you want to play again?");
                         yes = scanner.next();
                        if (yes.equalsIgnoreCase("no")) {
                            break;

                        } else {
                            System.out.println("Then try one more time");
                            roll = scanner.next();
                        }
                    } else { count ++;

                    }
                } while (true);

                if(yes.equalsIgnoreCase("no")) {
                    break;

                }
            } else {
                System.out.println("Dont you wanna play?");
            }


        }

    }
}
