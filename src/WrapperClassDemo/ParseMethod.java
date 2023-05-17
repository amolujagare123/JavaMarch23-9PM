package WrapperClassDemo;

public class ParseMethod {

    public static void main(String[] args) {

        String s1 = "11";
        String s2 = "12";

        System.out.println(s1+s2);

        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);

        System.out.println(a1+a2);

        String s3 = "11.45";
        String s4 = "12.56";

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);

        System.out.println(d1+d2);

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);
        System.out.println(f1+f2);

        String str = "true";
        boolean b = Boolean.parseBoolean(str);

        if(b)
            System.out.println("it is true");
        else
            System.out.println("it is not true");

        String s5 = "d";
       // char ch =



    }
}
