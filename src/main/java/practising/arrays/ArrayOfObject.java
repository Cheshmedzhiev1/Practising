package practising.arrays;

public class ArrayOfObject {
    public static void main(String[] args) {
        Student[]   array;

        array = new Student[5];

       array[0] = new Student(1, "krasio");
       array[1] = new Student(2, "ivan");
       array[2] = new Student(3, "martin");
       array[3] = new Student(4, "ng");
       array[4] = new Student(5, "mc");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at: " + i + " : { "
                    + array[i].roll_no + " "
                    + array[i].name + " }");

        }

    }
}