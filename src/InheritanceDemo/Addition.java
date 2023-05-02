package InheritanceDemo;

public class Addition {

    int a;
    int b;

    void add()
    {
        int c = 0;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int a,int b)
    {
        int c = 0;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int a)
    {
        int c = 0;
        c = a + 50;
        System.out.println("c="+c);
    }

    void add(int a,int b , int d)
    {
        int c = 0;
        c = a + b + d;
        System.out.println("c="+c);
    }

    void add(double a,double b)
    {
        double c = 0;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int[] arr)
    {
        int sum = 0;
        for (int i=0;i<arr.length;i++)
            sum = sum + arr[i];

        System.out.println("Addition="+sum);
    }

    void twoDimentionalArray(String[][] stArr)
    {
        System.out.println("Printing 2 D Array");
        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t\t");
            }
            System.out.println();
        }
    }

    void add(int a,double b,char ch, String s)
    {
        double c = 0;
        c = a + b;
        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("s="+s);
    }

    void add(String a,String b)
    {
        String c = "";
        c = a + b;
        System.out.println("c="+c);
    }

    public static void main(String[] args) {

        Addition ob = new Addition();
        ob.a = 45;
        ob.b = 90;
        ob.add();
        ob.add(11,78);
        ob.add(11,12,13);
        ob.add(11.12,23.13);
        ob.add("text","_output");
        ob.add(100);
        ob.add(12,23.13,'h',"amol");

        int[] arrayLocal = {45,67,11,23,45,78,90};

        ob.add(arrayLocal);

        String[][] twoDLocalArray = {
                {"Amol","Ankita","Ghanshyam"} ,
                {"Jeeva","Nagayya","Nagma"} ,
                {"Praveen","Satya","Vikash"} ,
                {"Anand","Rajesh","Abhishek"} ,
                {"Rahul","Rohit","vaishali"} ,
        };

        ob.twoDimentionalArray(twoDLocalArray);

    }
}
