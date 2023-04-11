package loops;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        String option="";

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter a=");
            a = sc.nextInt();

            System.out.println("Enter b=");
            b = sc.nextInt();

            System.out.println("Enter Option=");
            option = sc.next();

            switch (option) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;
                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;
                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;
                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;
                case "exit": break;
                default:
                    System.out.println("wrong choice");
                    break;
            }

            System.out.println("next operation....");

        }while (!option.equalsIgnoreCase("exit"));
        // while option value is not equal to 'exit'
    }
}
