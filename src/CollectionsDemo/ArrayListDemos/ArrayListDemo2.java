package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("sandhya");
        al.add("buvana");
        al.add("ganesh");
        al.add("sathya");

        System.out.println(al);
       // System.out.println(al.get(2));

        System.out.println("---- Using for loop --->>");
        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("---- Using Iterator --->>");
        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("---- Using for each loop --->>");
        for (String name:al)
        {
            System.out.println(name);
        }

    }
}
