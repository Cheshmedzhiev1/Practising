package practising.arrays;

public class ArraysFromMethods {
    public static void main(String[] args) {
        int array[] = m1();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
    }

    public static int[] m1() {
        return new int[]{1, 2, 3};

    }
}
