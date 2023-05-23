package CollectionsDemo.MapsDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(102,"Amol");
        tm.put(302,"Amrut");
        tm.put(122,"Ramya");
        tm.put(952,"Buvana");
        tm.put(302,"Priyanka");
        tm.put(302,"rajesh");


        System.out.println(tm);

    }
}
