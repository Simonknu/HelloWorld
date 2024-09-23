package ObjectsAndClasses;

public class Calculator {

    public void add(int numA, int numB){

        System.out.println("Addition of two integers: " + numA + " + " + numB + " = "+ numA+numB);

    }

    public void add(int numA, int numB, int numC){

        System.out.println("Addition of three integers: " + numA + " + " + numB + " + " + numC +  " = "+ numA+numB);

    }

    public void add(double numA, double numB){

        System.out.println("Addition of two doubles: " + numA + " + " + numB + " = "+ numA+numB);
    }

    public void add(String numA, String numB){
        int num1 = Integer.parseInt(numA);
        int num2 = Integer.parseInt(numB);
        System.out.println("Addition of two strings: " + numA + " + " + numB + " = "+ numA+numB);

    }


    public void multiply(int numA, int numB){
        System.out.println("Multiplication of two integers: " + numA + " * " + numB + " = "+ numA*numB);
    }

    public void multiply(double numA, double numB){
        System.out.println("Multiplication of two doubles: " + numA + " * " + numB + " = "+ numA*numB);
    }

    public void divide(int numA, int numB){
        System.out.println("Division of two integers: " + numA + " / " + numB + " = "+ numA/numB);
    }


}
