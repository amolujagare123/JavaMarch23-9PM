package WrapperClassDemo;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int a = 10;
        System.out.println("a="+a);

        Integer ii1 = new Integer(10);
        Integer ii2 = new Integer(a);

        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2);

        int b = 5;
        Integer ii3 = 5;
        Integer ii4 = b;

        System.out.println("ii3="+ii3);
        System.out.println("ii4="+ii4);



    }

}
