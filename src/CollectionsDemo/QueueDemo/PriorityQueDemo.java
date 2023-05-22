package CollectionsDemo.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();

        pq.offer(23);
        pq.offer(43);
        pq.offer(25);
        pq.offer(63);
        pq.offer(27);
        pq.offer(83);

        // 23,25,27,43,63,83

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
