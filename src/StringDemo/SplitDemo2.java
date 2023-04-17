package StringDemo;

public class SplitDemo2 {
    public static void main(String[] args) {

        String str = "who will know how to handle hot water";
        //String[] stArr = str.split("ho");
        String[] stArr = str.split("w");

        for (int i=0;i<stArr.length;i++)
        {
            System.out.println(stArr[i]);
        }
    }
}
