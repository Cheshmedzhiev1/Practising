package practising.stacks;

import java.util.Stack;

public class StackImplementing {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


        System.out.println(s);


        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
