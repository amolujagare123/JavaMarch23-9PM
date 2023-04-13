package ArrayDemo;

public class StringArrayDemo2 {

    public static void main(String[] args) {

        String[] stArr = new String[2];

        stArr[0] = "PLEASE PROVIDE A USERNAME";
        stArr[1] = "PLEASE PROVIDE A PASSWORD";


        System.out.println("length of the array="+stArr.length);

        for (int i=0;i<stArr.length;i++)
         System.out.println(stArr[i]);

    }
}
