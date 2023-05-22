package CollectionsDemo.LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("sandhya");
        ll.add("buvana");
        ll.add("ganesh");
        ll.add("sathya");

        System.out.println(ll);
        ll.addFirst("first");
        ll.addLast("last");
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
