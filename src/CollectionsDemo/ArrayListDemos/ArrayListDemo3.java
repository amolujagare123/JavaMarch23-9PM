package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("sandhya");
        al.add("buvana");
        al.add("ganesh");
        al.add("sathya");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();
        System.out.println("al2="+al2);

        al2.addAll(al);
        System.out.println("al2="+al2);


    }
}
