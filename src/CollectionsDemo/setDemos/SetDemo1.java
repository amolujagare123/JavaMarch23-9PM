package CollectionsDemo.setDemos;

import java.util.HashSet;

public class SetDemo1 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("amol");
        hs.add("amrut");
        hs.add("Ramya");
        hs.add("Buvana");
        hs.add("Priyanka");
        System.out.println(hs.add("Priyanka"));

        System.out.println(hs);
    }
}
