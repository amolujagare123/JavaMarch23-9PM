package InheritanceDemo.SuperKeyword;



public class Employee {

    Employee()
    {
        System.out.println("Its employee a constructor");
    }

    Employee(int x)
    {
        System.out.println("x="+x);
        System.out.println("Its a parameterized constructor");
    }
    int totalMarkedHolidays = 25;
    void calculateDays()
    {
        System.out.println("6 days week");
        System.out.println("Calculate accordingly");
    }
    int salary = 25000;
    void empWork() {
        System.out.println("empWork");
        System.out.println("totalMarkedHolidays="+totalMarkedHolidays);
        calculateDays();
    }



}

    class Programmer extends Employee
    {

        Programmer()
        {
            //super();
            super(90);
            System.out.println("Programmer Constructor");
        }
        int totalMarkedHolidays = 30;
        void calculateDays()
        {
            System.out.println("5 days week");
            System.out.println("Calculate accordingly");
        }
        int bonus = 15000;
        void programmerWork()
        {
            System.out.println("programmerWork");
            System.out.println("totalMarkedHolidays="+super.totalMarkedHolidays); // 30
            super.calculateDays();
        }
        public static void main(String[] args) {

           /* Programmer p = new Programmer();
            System.out.println("bonus="+p.bonus);
            p.programmerWork();*/

            Programmer p = new Programmer();



        }


}




