package CollectionsDemo.MapsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(102,"Amol");
        lhm.put(302,"Amrut");
        lhm.put(122,"Ramya");
        lhm.put(952,"Buvana");
        lhm.put(302,"Priyanka");
        lhm.put(302,"rajesh");


        System.out.println(lhm);

    }
}
