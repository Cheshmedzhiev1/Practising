package practising.stacks;

import java.util.Stack;

public class RemovingElements {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);

        System.out.println("Initial stack: " + stack);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop operations: " + stack);

        System.out.println("Is stack empty? " + stack.empty());  //popping the remaining elements
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.empty());  //checking again

    }
}
