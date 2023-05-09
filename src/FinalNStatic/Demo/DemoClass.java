package FinalNStatic.Demo;

import FinalNStatic.Student2;

/*import static FinalNStatic.Student2.staticMethod1;
import static FinalNStatic.Student2.staticMethod2;
import static FinalNStatic.Student2.college;*/

import static FinalNStatic.Student2.*;
public class DemoClass {

    public static void main(String[] args) {

        Student2 s = new Student2();
        staticMethod1();
        s.staticMethod2();
        System.out.println("college="+s.college);


        staticMethod1();
        Student2.staticMethod2();
        System.out.println("college="+Student2.college);

        staticMethod1();
        staticMethod2();
        System.out.println("college="+college);

    }
}
