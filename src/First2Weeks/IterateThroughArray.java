package First2Weeks;

public class IterateThroughArray {
    public static void main(String[] args) {
        double[] doubles = {4.5, 25.3, 12.1, 34.0, 15.5};
        for (double i : doubles) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (double potens : doubles) {
            double iPow = Math.pow(potens, 2);
            System.out.print(iPow + " ");

        }

        System.out.println(" ");

        double min = doubles[0];
        for (double i : doubles) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("the lowest value is: " + min);

        double max = doubles[0];
        for (double i : doubles) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The biggest value in the array is: " + max);


        for (double i : doubles) {
            if (i == 12.1) {
                System.out.println("Hooray. The number 12.1 was found in index n. " + i);
            }

            }

        }
    }

