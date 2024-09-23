package First2Weeks;

public class Arrays {

    public static void main(String[] args) {


        int[] array = new int[8];
        array[0] = 34;
        array[7] = 117;

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        String[] strinArray = {"Hello", "with", "you"};

        for(int i = 0; i < strinArray.length; i++){
            System.out.print(strinArray[i] + " ");
        }
        System.out.println(" ");
        double[] doubleArray = { 3.4, 2.5, 1.2, 6.7};

        System.out.println(doubleArray[2]);
        System.out.println(doubleArray.length);
        // If you print index 4, it comes an error because there is only 4 element so the las index would be 3

    }
}
