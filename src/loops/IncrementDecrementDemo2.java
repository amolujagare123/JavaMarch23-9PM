package loops;

public class IncrementDecrementDemo2 {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i);// 8
        System.out.println(i); // 8

        /*
        a++ / a - - : Here first statement is executed,
                     then increment or decrement happens
        ++a / - - a : Here First increment or decrement happens,
                     then the statement is executed

         */
    }
}
