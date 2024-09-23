package First2Weeks;

import java.util.Scanner;

public class Tidsberegner {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
//write the time
        System.out.println("We are going to write the time." + "\nPlease write the hours");

int  hours = scanner.nextInt();
        System.out.println("Please write the minutes");

int minutes = scanner.nextInt();
        System.out.println("Please write the seconds");
        int seconds = scanner.nextInt();
        System.out.println("You said the times is: " + hours + " hours, " + minutes + " minutes and "
        + seconds + " seconds.");
        System.out.println("");
        //Say how many seconds has it gone since midnight


        int secondsSinceMidnight = hours * 3600 + minutes * 60 + seconds;
        System.out.println("It has been " + secondsSinceMidnight + " since midnight");





    }
}
