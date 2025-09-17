package practising.arrays;

public class ArraysToMethods {
    public static void main(String[] args) {

        int array[] = {3, 1, 2, 5, 4};

        sum(array);

    }

    public static void sum(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];
            System.out.println("Sum of array values: " + sum);

        }
    }
}
