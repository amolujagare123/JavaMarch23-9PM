package CollectionsDemo.setDemos;

import java.util.HashSet;
import java.util.LinkedList;

public class SetDemo2 {

    public static void main(String[] args) {

        LinkedList<String> lhs = new LinkedList<>();

        lhs.add("amol");
        lhs.add("amrut");
        lhs.add("Ramya");
        lhs.add("Buvana");
        lhs.add("Priyanka");
        System.out.println(lhs.add("Priyanka"));

        System.out.println(lhs);
    }
}
