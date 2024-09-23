package HoldMedStuderende;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Studerende student1 = new Studerende("Simon", "simon@gmail.com");
        Studerende student2 = new Studerende("Mikkel", "mikkel@gmail.com");

        Hold team1 = new Hold();

        System.out.println(team1.toString());

        team1.addStudent(student1);
        team1.addStudent(student2);

        System.out.println(team1.toString());

        System.out.println(team1.findStudent("simon"));
        System.out.println(team1.findStudent("alberto"));

        System.out.println("Type a student you want to find in the team");
        String studentUserFind = scanner.nextLine();
        System.out.println(team1.findStudent(studentUserFind));
        System.out.println(team1);
        boolean check = team1.checkStudent(studentUserFind);
        if(check) {


            System.out.println("set a new name for the student ");
            String userNewName = scanner.nextLine();
            team1.findNameToSet(studentUserFind, userNewName);

        }


            }









        }







