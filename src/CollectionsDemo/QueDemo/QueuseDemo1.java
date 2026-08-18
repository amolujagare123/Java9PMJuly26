package CollectionsDemo.QueDemo;

import java.util.PriorityQueue;

public class QueuseDemo1 {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();
        pq.offer(12);
        pq.offer(32);
        pq.offer(13);
        pq.offer(42);
        pq.offer(14);
        pq.offer(52);

      //  pq.offer("amol");
        // 12,13,14,32,42,52
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
