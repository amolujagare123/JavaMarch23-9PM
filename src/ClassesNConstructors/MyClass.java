package ClassesNConstructors;

public class MyClass {

    public int a;
    public double d;
    public char c;
    public String str;

    public void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int x ;
        x = 10;

        MyClass ob = new MyClass();
        ob.a = 11 ;
        ob.d = 11.34 ;
        ob.c = 'h' ;
        ob.str = "amol" ;
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 21 ;
        ob2.d = 12.34 ;
        ob2.c = 'd' ;
        ob2.str = "java" ;
        ob2.display();
    }
}
