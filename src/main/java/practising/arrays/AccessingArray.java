package practising.arrays;

public class AccessingArray {
    public static void main(String[] args) {

        int [] array;

        array = new int[5];

        array[0] = 2;
        array[1] = 4;
        array[2] = 8;
        array[3] = 12;
        array[4] = 16;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index: " + i + " : " + array[i]);

        }
    }
}
