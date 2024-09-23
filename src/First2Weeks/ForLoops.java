package First2Weeks;

public class ForLoops {

    public static void main(String[] args) {
        int num = 1;


        for (int i = 0; i < 4; i++){
            int result = 2*num;
            System.out.println("2 times " + num + " = " + result);
            num++;

        }
        System.out.println(" ");
        for(int i = 1; i < 5; i++){
            System.out.println("2 gange " + i + " = " + i*2);


        }
        for(int i = 2; i <= 12; i +=2){
            System.out.print(i + " ");
        }
        System.out.println(" ");


        for(int i = 4; i <= 79; i +=15){
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for(int i = 30; i >= -20; i -=10){
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for(int i = -7; i <= 13; i +=4){
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for(int i = 97; i >= 82; i -=3){
            System.out.print(i + " ");
        }


    }
}


