package practising.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PqAddingElements {
    public static void main(String[] args) {

        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("for");
        pq.add("Geeks");

        System.out.println(pq);
    }
}
