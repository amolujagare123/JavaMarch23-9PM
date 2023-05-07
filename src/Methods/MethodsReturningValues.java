package Methods;

import ClassesNConstructors.MyClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsReturningValues {

    int getMyInt()
    {
        int a = 10;
        return a;
    }

    String getMyString()
    {
        String str = "This is a method";
        return str;
    }

    Date convertStringToDate(String dateStr) throws ParseException // dd/MM/yyyy
    {
        return new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
    }

    MyClass getMyObject()
    {
        MyClass obj = new MyClass();
        obj.a = 100;
        obj.d = 123.34;
        obj.c = 'g';
        obj.str = "Java";

        return obj;
    }

    int[] getMyArray()
    {
        int[] x = {23,56,78,90,12,32,56,16,97};

        return x;
    }

    String[][] getMyTwoDArray()
    {
        String[][] st = {
                {"Amol","Ankita","Ghanshyam"} ,
                {"Jeeva","Nagayya","Nagma"} ,
                {"Praveen","Satya","Vikash"} ,
                {"Anand","Rajesh","Abhishek"} ,
                {"Rahul","Rohit","vaishali"}
        };

        return st;
    }


    public static void main(String[] args) throws ParseException {

        /*int x = 77 ;
        System.out.println(x);
        int y = x;*/

        MethodsReturningValues ob = new MethodsReturningValues();

        System.out.println("ob.getMyInt()="+ob.getMyInt());
        int a1 = ob.getMyInt();
        System.out.println("a1="+a1);

        System.out.println("ob.getMyString()="+ob.getMyString());
        String ss = ob.getMyString();
        System.out.println("ss="+ss);

        System.out.println(ob.convertStringToDate("23/03/2012"));
        Date dd = ob.convertStringToDate("23/03/2012");
        System.out.println("dd="+dd);

       // MyClass myClass = ob.getMyObject();

        MyClass myClass = new MyClass();

        myClass = ob.getMyObject();

        myClass.display();

        int[] a = ob.getMyArray();

     /*   for (int value:a)
        {
            System.out.println(value);
        }*/

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);


        String[][] stArr = ob.getMyTwoDArray();

        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t\t");
            }
            System.out.println();
        }

    }

}
