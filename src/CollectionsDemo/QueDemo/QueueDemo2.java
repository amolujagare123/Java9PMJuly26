package CollectionsDemo.QueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo2 {

    public static void main(String[] args) {

        ArrayDeque pq = new ArrayDeque();

        pq.offer("amol");
        pq.offer("reena");
        pq.offer("aniruddha");
        pq.offer("Nisha");
        pq.offer("Preetha");
        pq.offer("Vishal");

        System.out.println(pq);

        pq.offerFirst("first");
        pq.offerLast("Last");

        System.out.println(pq);

        pq.pollFirst();
        pq.pollLast();

        System.out.println(pq);

    }
}
