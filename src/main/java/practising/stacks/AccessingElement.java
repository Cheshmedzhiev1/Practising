package practising.stacks;

import java.util.Stack;

public class AccessingElement {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Welcome");    //using push to add elements to the stack
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        System.out.println("Initial stack: " + stack);

        System.out.println("The element on top of the stack is: " + stack.peek());

        System.out.println("Final stack: " + stack);

    }
}
