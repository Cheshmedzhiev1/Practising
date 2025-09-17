package practising.arrays;

public class AccessingOutsideArray {
    public static void main(String[] args) {

        int[] array = new int[4];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;

        System.out.println("Trying to access element outside size of the array");
        System.out.println(array[5]);

        //arrayindexoutofboundexpection

    }
}
