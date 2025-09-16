package practising.stacks;

import java.util.Stack;

public class OperationsUsingStack {

    static void stack_push(Stack<Integer> stack) {    //pushing an element on top of the stack
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack) {     //popping an element from the stack
        System.out.println("Pop operation");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);   // 0 to 4 in our case
        }
    }

    static void stack_peek(Stack<Integer> stack) {    //displaying the element on top of the stack
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    static void stack_search(Stack<Integer> stack, int element) {  //searching for an element in the stack
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element is not found");
        else
            System.out.println("Element is found at pos: " + pos);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);

    }
}