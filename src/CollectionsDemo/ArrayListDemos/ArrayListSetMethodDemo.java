package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListSetMethodDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("sandhya");
        al.add("buvana");
        al.add("ganesh");
        al.add("sathya");

        System.out.println("al="+al);

        al.set(3,"aaaa");
        System.out.println("al="+al);




    }
}
