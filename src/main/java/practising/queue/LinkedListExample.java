package practising.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {

        Queue<Integer> ll = new LinkedList<Integer>();

        ll.add(10);
        ll.add(20);
        ll.add(15);

        System.out.println(ll);

        System.out.println(ll.peek());
        System.out.println(ll + "Peeked once");

        System.out.println(ll.poll());
        System.out.println(ll + "Poll-ed once");

        System.out.println(ll.peek());
        System.out.println(ll + " Peeked second time");
    }
}
