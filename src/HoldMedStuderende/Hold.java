package HoldMedStuderende;

import java.util.ArrayList;

public class Hold {
    private ArrayList<Studerende> students;



    public Hold (){
        this.students = new ArrayList<Studerende>();
    }

    public void addStudent(Studerende student){
        students.add(student);

    }

    public String toString(){
        String result = "";
        for (Studerende s: students){
            result += s.toString() + "\n";
        }
        return result;
    }

    public String findStudent(String student){
        boolean found = false;
        for (Studerende s: students){
            if (s.getName().equalsIgnoreCase(student)){
                found = true;
            }
        }
        return found
                ? "Student "+ student +  " found"
                : "Student " + student + " not found";


    }

    public boolean checkStudent(String checkName){
        for (Studerende s: students){
        if (checkName.equalsIgnoreCase(s.getName())){
            return true;
            }
    }
        return false;
    }
    public void findNameToSet(String name, String newName){
        for (Studerende s: students){
            if (name.equalsIgnoreCase(s.getName())){
                s.setName(newName);
            }
        }
    }
}


