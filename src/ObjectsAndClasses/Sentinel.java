package ObjectsAndClasses;

import java.util.Scanner;

public class Sentinel {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         final int SENTINEL = -1;
         int sum = 0;
         int num = 0;
        System.out.println("Write a number you want to add. \n To stop, write -1.");
         while (num != SENTINEL){
             sum = sum + num;
              num = scanner.nextInt();


         }
        System.out.println("The sum of the number you gave is: " + sum + ".");


    }
}
