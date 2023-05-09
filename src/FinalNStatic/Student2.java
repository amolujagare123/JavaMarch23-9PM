package FinalNStatic;

public class Student2 {
    int rno;
    String name;
    public static String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");
       // System.out.println("rno="+rno); // non-static - not allowed
     //   System.out.println("name="+name); // non-static - not allowed
        System.out.println("college="+college); //static - allowed
       // display(); // non-static - not allowed
        staticMethod2();  //static - allowed
      //  nonStaticMethod(); // non-static - not allowed
    }

    public static void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
        System.out.println("rno="+rno); // non-static - allowed
        System.out.println("name="+name); // non-static - allowed
        System.out.println("college="+college); //static - allowed
        display(); // non-static - allowed
        staticMethod2();  //static - allowed
        nonStaticMethod(); // non-static - allowed
    }


    public static void main(String[] args) {
        Student2 s1 =new Student2();
        Student2 s2 =new Student2();
        Student2 s3 =new Student2();

        // Static method can be called using any class object
        s1.staticMethod1();
        s2.staticMethod1();
        s3.staticMethod1();

        // Static method can be called using class name as well
        Student2.staticMethod2();

    }
}
