package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        System.out.println(s.empty()); // true

        s.push(12);
        s.push(32);
        s.push(14);
        s.push(52);
        s.push(16);

        System.out.println(s.empty()); // false

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.peek()); // 52
        System.out.println(s); //


    }
}
