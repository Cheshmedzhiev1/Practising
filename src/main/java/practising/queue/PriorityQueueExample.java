package practising.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(10);
        pq.add(20);
        pq.add(15);

        System.out.println(pq);
        System.out.println(pq.peek());

        System.out.println(pq);
        System.out.println(pq.poll());  //takes head of queue and removes it

        System.out.println(pq);
        System.out.println(pq.peek()); // takes head of the queue and does NOT remove it

        System.out.println(pq);
    }
}
