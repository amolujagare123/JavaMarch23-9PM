package CollectionsDemo.setDemos;

import java.util.LinkedList;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Amol");
        ts.add("Amrut");
        ts.add("Ramya");
        ts.add("Buvana");
        ts.add("Priyanka");
        System.out.println(ts.add("Priyanka"));

        System.out.println(ts);
    }
}
