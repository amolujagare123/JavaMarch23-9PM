package exceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[0] = 11;
            a[1] = 56;
            a[2] = 77;
            a[3] = 33;
            a[4] = 65;
            a[5] = 78;
       }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("length of the array="+a.length);

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");

    }
}
