package HoldMedStuderende;

public class Studerende {
    private String name;
    private String email;


    public Studerende(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setEmail(String newEmail) {
        this.email = email;
    }
    public String toString(){
        return "Name: " + name + " - Email: " + email;
    }
}
