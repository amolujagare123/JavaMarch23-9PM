package ClassesNConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str;
   /* MyClass2()
    {

    }*/

    /*MyClass2()
    {
        a = 13;
        d = 34.56;
        c = 'f';
        str = "selenium";
    }*/

   /* MyClass2(int a1, double d1, char c1, String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }*/

    MyClass2(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }
    public static void main(String[] args) {
      //  MyClass2 ob = new MyClass2();
        MyClass2 ob = new MyClass2(23,34.56,'h',"text");
        ob.display();
    }
}
