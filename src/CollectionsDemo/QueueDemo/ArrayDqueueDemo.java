package CollectionsDemo.QueueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDqueueDemo {

    public static void main(String[] args) {
        ArrayDeque adq = new ArrayDeque();

        adq.offer(23);
        adq.offer(43);
        adq.offer(25);
        adq.offer(63);
        adq.offer(27);
        adq.offer(83);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);


    }
}
