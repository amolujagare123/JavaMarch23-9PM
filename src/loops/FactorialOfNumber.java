package loops;

public class FactorialOfNumber {

    public static void main(String[] args) {
        int mult=1;

        int n = 6;

        for (int i = n; i >= 1; i--)
            mult= mult*i;

        System.out.println(mult);
    }
}
