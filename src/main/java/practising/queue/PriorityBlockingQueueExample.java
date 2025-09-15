package practising.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
    public static void main(String[] args) {

        Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();

        pbq.add(10);
        pbq.add(20);
        pbq.add(15);

        System.out.println(pbq);

        System.out.println(pbq.peek());
        System.out.println(pbq + "Peeked once");

        System.out.println(pbq.poll());
        System.out.println(pbq + "Poll-ed once");

        System.out.println(pbq.peek());
        System.out.println(pbq + "peeked twice");
    }
}
