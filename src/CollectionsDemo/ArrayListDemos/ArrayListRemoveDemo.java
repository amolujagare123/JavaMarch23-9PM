package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println("isEmpty="+al.isEmpty());// true

        al.add("amol");
        al.add("sandhya");
        al.add("buvana");
        al.add("ganesh");
        al.add("sathya");
        System.out.println("isEmpty="+al.isEmpty());// false

        System.out.println("al="+al);

       // al.remove(2);
        al.remove("ganesh");
        System.out.println("al="+al);

        al.clear();
        System.out.println("isEmpty="+al.isEmpty()); // true

        System.out.println("al="+al);




    }
}
