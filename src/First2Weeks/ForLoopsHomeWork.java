package First2Weeks;

import java.util.Scanner;

public class ForLoopsHomeWork {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hvor mange stjerner vil du udskrive?");
        int antalStjerner = scan.nextInt();
        int count = 0;
        while (count < antalStjerner) {
            System.out.print("*");
            count++;
        }
        System.out.println(" ");
        System.out.println("Hvor mange stjerner vil du udsrkive?");
        int antalStjerner2 = scan.nextInt();
        for (int i = 0; i < antalStjerner2; i++){
            System.out.print("*");
        }





    }
}
