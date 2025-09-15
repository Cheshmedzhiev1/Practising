package practising.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PqRemovingElements {
    public static void main(String[] args) {


        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial queue: " + pq);

        pq.remove("Geeks");

        System.out.println("After remove: " + pq);

        System.out.println("Poll method: " + pq.poll());

        System.out.println("Final queue: " + pq);

    }
}
