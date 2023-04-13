package ArrayDemo;

public class IntegerArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 11;
        a[1] = 56;
        a[2] = 77;
        a[3] = 33;
        a[4] = 65;

        System.out.println("length of the array="+a.length);

        for (int i=0;i<a.length;i++)
         System.out.println(a[i]);

    }
}
