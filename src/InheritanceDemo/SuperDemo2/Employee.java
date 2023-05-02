package InheritanceDemo.SuperDemo2;

public class Employee {

    Employee()
    {
        System.out.println("Employee Constructor");
    }

    Employee(int a)
    {
        System.out.println("Employee Constructor");
        System.out.println("a="+a);
    }
    int totalMarkedHolidays = 25;
    int salary = 10000;
    void empWork()
    {
        System.out.println("empWork");
    }

    void common()
    {
        System.out.println("Employee common");
    }
}

class Programmer extends Employee
{
    Programmer()
    {
        super(12);
        System.out.println("programmer constructor");
    }
    int totalMarkedHolidays = 30;
    int bonus = 5000;
    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    void common()
    {
        System.out.println("Programmer common");
    }
    void display()
    {
        System.out.println("totalMarkedHolidays="+totalMarkedHolidays); // 30
        System.out.println("totalMarkedHolidays="+super.totalMarkedHolidays); // 25
        System.out.println("bonus="+bonus); // 5000
        System.out.println("salary="+salary);

        common(); //
        super.common();
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.display();
        p.empWork();
    }
}