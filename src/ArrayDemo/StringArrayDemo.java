package ArrayDemo;

public class StringArrayDemo {

    public static void main(String[] args) {

        String[] stArr = new String[5];

        stArr[0] = "Amol";
        stArr[1] = "Rahul";
        stArr[2] = "Rohit";
        stArr[3] = "Varsha";
        stArr[4] = "Vaibhav";


        System.out.println("length of the array="+stArr.length);

        for (int i=0;i<stArr.length;i++)
         System.out.println(stArr[i]);

    }
}
