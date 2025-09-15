package practising.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PqIterating {
    public static void main(String[] args) {


        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
