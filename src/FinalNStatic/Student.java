package FinalNStatic;

public class Student {
    int rno;
    String name;
    static  String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {
        Student s1 =new Student();
        Student s2 =new Student();
        Student s3 =new Student();

        s1.rno = 1;
        s1.name = "Ankita";

        s2.rno = 2;
        s2.name = "Buvana";
        s2.college = "ABCD";

        s3.rno = 3;
        s3.name = "Ghanshyam";

        Student.college = "PICT";

        s1.display();
        s2.display();
        s3.display();



    }
}
