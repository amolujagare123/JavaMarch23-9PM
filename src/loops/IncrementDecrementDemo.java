package loops;

public class IncrementDecrementDemo {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i);// 12
        System.out.println(i); // 12

        /*
        a++ / a - - : Here first statement is executed,
                     then increment or decrement happens
        ++a / - - a : Here First increment or decrement happens,
                     then the statement is executed

         */
    }
}
