package StringDemo;

public class SplitDemo {
    public static void main(String[] args) {

        String str = "Hi This is Java";
        String[] stArr = str.split("i");

        for (int i=0;i<stArr.length;i++)
        {
            System.out.println(stArr[i]);
        }
    }
}
